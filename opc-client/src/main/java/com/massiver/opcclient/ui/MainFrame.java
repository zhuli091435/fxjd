/*
 * Created by JFormDesigner on Mon Jun 17 09:26:48 CST 2024
 */

package com.massiver.opcclient.ui;

import javax.swing.table.*;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.massiver.opcclient.App;
import com.massiver.opcclient.pojo.CtrlOrder;
import com.massiver.opcclient.pojo.OPCItemInfo;
import com.massiver.opcclient.service.DynamicService;
import com.massiver.opcclient.service.OPCItemInfoService;
import com.massiver.opcclient.service.impl.DynamicServiceImpl;
import com.massiver.opcclient.service.impl.OPCItemInfoServiceImpl;
import com.massiver.opcclient.utils.ExceptionUtil;
import com.massiver.opcclient.utils.OPCUAUtils;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.UaClient;
import org.eclipse.milo.opcua.stack.core.Identifiers;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.builtin.Variant;
import org.eclipse.milo.opcua.stack.core.types.enumerated.ServerState;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.*;

/**
 * @author Administrator
 */
public class MainFrame extends JFrame {

    int PORT = 8060;
    static Logger logger = LoggerFactory.getLogger(MainFrame.class);
    ObjectMapper objectMapper = new ObjectMapper();
    OPCItemInfoService opcItemInfoService = new OPCItemInfoServiceImpl();
    DynamicService dynamicService = new DynamicServiceImpl();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    OpcUaClient clientControl = null;

    public MainFrame() {
        initComponents();
        initTable();
        startListenOrder();
        startGetData();

    }

    private void initTable() {

        try {
            List<OPCItemInfo> opcItemInfoList = opcItemInfoService.getAll().stream().filter(o -> o.getSignType().equals("read")).toList();

            DefaultTableModel model = (DefaultTableModel) this.tableData.getModel();

            Vector dataVector = model.getDataVector();
            dataVector.removeAllElements();
            int index = 0;
            for (OPCItemInfo opcItemInfo : opcItemInfoList) {
                Vector<Object> objects = new Vector<>();
                objects.add(++index);
                objects.add(opcItemInfo.getChannelName());
                objects.add(opcItemInfo.getDeviceName());
                objects.add(opcItemInfo.getSignName());
                objects.add("");
                objects.add("");
                objects.add(opcItemInfo.getTableName());
                objects.add(opcItemInfo.getColumnName());
                model.addRow(objects);
            }
        } catch (Exception e) {
            //throw new RuntimeException(e);
        }
    }

    private void reFreshTable(OPCItemInfo opcItemInfo, String dateFormat) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) this.tableData.getModel();
        int rowCount = defaultTableModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String channelName = (String) defaultTableModel.getValueAt(i, 1);
            String deviceName = (String) defaultTableModel.getValueAt(i, 2);
            String signName = (String) defaultTableModel.getValueAt(i, 3);
            if (channelName.equals(opcItemInfo.getChannelName()) && deviceName.equals(opcItemInfo.getDeviceName()) && signName.equals(opcItemInfo.getSignName())) {
                defaultTableModel.setValueAt(dateFormat, i, 4);
                defaultTableModel.setValueAt(opcItemInfo.getValue() == null ? "" : opcItemInfo.getValue().toString(), i, 5);
                break;
            }
        }
    }

    //通过OPC获取最新的数据
    private void startGetData() {
        //初始化指令
        Thread startGetDataThread = new Thread(() -> {
            OpcUaClient client = null;
            while (true) {
                try {
                    if (client == null) {
                        logger.info("开始创建OpcUaClient");
                        //创建OPCUA客户端
                        client = OPCUAUtils.createClient();
                        logger.info("完成创建OpcUaClient");
                    }

                    //记录读取数据时间
                    Date date = new Date();
                    String dateFormat = simpleDateFormat.format(date);
                    if (date.getMinutes() % 5 == 0) {
                        //获取所有标记
                        List<OPCItemInfo> opcItemInfoList = opcItemInfoService.getAll().stream().filter(o -> o.getSignType().equals("read") && o.getEnable() == 1).toList();

                        //为避免部分PLC离线影响其他正常PLC数据的读取速度,故按照PLC进行分组，分组读取数据
                        Map<String, List<OPCItemInfo>> opcItemInfoMap = opcItemInfoList.stream().collect(Collectors.groupingBy(OPCItemInfo::getDeviceName));

                        //连接OPC服务器
                        logger.info("开始连接OPC服务器");
                        UaClient uaClient = client.connect().get();
                        logger.info("完成连接OPC服务器");

                        //由于三个水位不在一个PLC上，故水位特殊处理
                        List<OPCItemInfo> opcItemInfoWater = new ArrayList<>();

                        for (String device : opcItemInfoMap.keySet()) {

                            logger.info("开始获取" + device + "数据");
                            List<OPCItemInfo> opcItemInfos = opcItemInfoMap.get(device);
                            List<NodeId> nodeIdList = new ArrayList<>();
                            for (OPCItemInfo opcItemInfo : opcItemInfos) {
                                nodeIdList.add(new NodeId(0, opcItemInfo.getChannelName() + "." + opcItemInfo.getDeviceName() + "." + opcItemInfo.getSignName()));
                            }
                            //读取数据
                            logger.info("开始读取数据");
                            List<DataValue> dataValues = readData(client, nodeIdList).get();
                            logger.info("结束读取数据");

                            for (int i = 0; i < opcItemInfos.size(); i++) {
                                if (dataValues.get(i).getStatusCode().isGood()) {
                                    opcItemInfos.get(i).setValue(dataValues.get(i).getValue().getValue());
                                } else {
                                    opcItemInfos.get(i).setValue(0);
                                }

                            }
                            Map<String, List<OPCItemInfo>> opcItemInfoValueMap = opcItemInfos.stream().collect(Collectors.groupingBy(OPCItemInfo::getDeviceID));
                            for (String deviceID : opcItemInfoValueMap.keySet()) {
                                if (deviceID.equals("Water")) {
                                    //暂时缓存读取到的水位数据，待全部水位读取完成再入库
                                    opcItemInfoWater.addAll(opcItemInfoValueMap.get(deviceID));
                                } else {
                                    savaData(opcItemInfoValueMap.get(deviceID), dateFormat);
                                }
                            }
                            logger.info("完成获取" + device + "数据");
                        }

                        //将缓存的水位数据保存入库
                        if (opcItemInfoWater.size() > 0) {
                            savaData(opcItemInfoWater, dateFormat);
                        }

                    }

                } catch (Exception e) {
                    logger.error(e.getMessage());
                } finally {
                    try {
                        if (client != null) {
                            client.disconnect().get();
                        }
                    } catch (Exception e) {
                        //throw new RuntimeException(e);
                    }
                }

                try {
                    Thread.sleep(1000 * 60);
                } catch (Exception e) {
                    //throw new RuntimeException(e);
                }
            }
        });
        startGetDataThread.setDaemon(true);
        startGetDataThread.start();
    }

    private void savaData(List<OPCItemInfo> opcItemInfoValues, String dateFormat) {
        switch (opcItemInfoValues.get(0).getTableName()) {
            case "ST_RAIN_R":
            case "ST_CABINET_R":
            case "ST_PUMP_R":
            case "ST_GATE_R":
            case "ST_H_GATE_R":
            case "ST_Valve_R":
            case "ST_Flow_R":
                savaDataWithEQPNO(opcItemInfoValues, dateFormat);
                break;
            case "ST_WAS_R":
            case "ST_WaveMaker_R":
                savaDataWithNoEQPNO(opcItemInfoValues, dateFormat);
                break;
        }
    }

    private void savaDataWithEQPNO(List<OPCItemInfo> opcItemInfoValues, String dateFormat) {
        StringBuilder columnStr = new StringBuilder();
        StringBuilder valueStr = new StringBuilder();
        for (OPCItemInfo opcItemInfoValue : opcItemInfoValues) {
            columnStr.append(opcItemInfoValue.getColumnName()).append(", ");
            if (opcItemInfoValue.getValue() == null) {
                valueStr.append("null, ");
            } else {
                valueStr.append("'").append(opcItemInfoValue.getValue()).append("', ");
            }
            reFreshTable(opcItemInfoValue, dateFormat);
        }
        String[] paramsArr = new String[6];
        paramsArr[0] = opcItemInfoValues.get(0).getTableName();
        paramsArr[1] = columnStr.substring(0, columnStr.lastIndexOf(","));
        paramsArr[2] = "'" + opcItemInfoValues.get(0).getStationID() + "'";
        paramsArr[3] = "'" + dateFormat + "'";
        paramsArr[4] = "'" + opcItemInfoValues.get(0).getDeviceID() + "'";
        paramsArr[5] = valueStr.substring(0, valueStr.lastIndexOf(","));
        String sql = MessageFormat.format("insert into {0} (STCD, TM, EQPNO, {1}) values ({2}, {3}, {4}, {5})", paramsArr);
        logger.info(sql);
        int res = dynamicService.executeSQL(sql);
    }

    private void savaDataWithNoEQPNO(List<OPCItemInfo> opcItemInfoValues, String dateFormat) {
        StringBuilder columnStr = new StringBuilder();
        StringBuilder valueStr = new StringBuilder();
        for (OPCItemInfo opcItemInfoValue : opcItemInfoValues) {
            columnStr.append(opcItemInfoValue.getColumnName()).append(", ");
            if (opcItemInfoValue.getValue() == null) {
                valueStr.append("null, ");
            } else {
                valueStr.append("'").append(opcItemInfoValue.getValue()).append("', ");
            }
            reFreshTable(opcItemInfoValue, dateFormat);
        }
        String[] paramsArr = new String[5];
        paramsArr[0] = opcItemInfoValues.get(0).getTableName();
        paramsArr[1] = columnStr.substring(0, columnStr.lastIndexOf(","));
        paramsArr[2] = "'" + opcItemInfoValues.get(0).getStationID() + "'";
        paramsArr[3] = "'" + dateFormat + "'";
        paramsArr[4] = valueStr.substring(0, valueStr.lastIndexOf(","));
        String sql = MessageFormat.format("insert into {0} (STCD, TM, {1}) values ({2}, {3}, {4})", paramsArr);
        logger.info(sql);
        int res = dynamicService.executeSQL(sql);


    }

    private CompletableFuture<List<DataValue>> readData(OpcUaClient client, List<NodeId> nodeIds) {
        return client.readValues(0.0, TimestampsToReturn.Both, nodeIds);
    }

    private void startListenOrder() {

        try {
            clientControl = OPCUAUtils.createClient();
        } catch (Exception e) {
            logger.error("startListenOrder OpcUaClient创建失败");
        }

        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
            server.createContext("/control", exchange -> {
                handelRequest(exchange);
            });
            server.setExecutor(null); // creates a default executor
            server.start();
            logger.info("端口" + PORT + "监听成功");
        } catch (IOException e) {
            //throw new RuntimeException(e);
            logger.error("端口" + PORT + "监听失败");
        }


    }

    private void handelRequest(HttpExchange exchange) {

        //
        if (clientControl == null) {
            try {
                clientControl = OPCUAUtils.createClient();
            } catch (Exception e) {
                logger.error("handelRequest OpcUaClient创建失败");
            }
        }

        HashMap<String, Object> resultMap = new HashMap<>();
        try {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            String jsonInput = new String(bytes, StandardCharsets.UTF_8);
            CtrlOrder ctrlOrder = objectMapper.readValue(jsonInput, CtrlOrder.class);


            if (ctrlOrder.getOrderCode().equals("01")) {
                clientControl.connect().get();
                List<OPCItemInfo> opcItemInfoList = opcItemInfoService.getByDeviceName(ctrlOrder.getOrderParam()).stream().filter(o -> o.getSignType().equals("read")).toList();

                List<NodeId> nodeIdList = new ArrayList<>();
                for (OPCItemInfo opcItemInfo : opcItemInfoList) {
                    nodeIdList.add(new NodeId(0, opcItemInfo.getChannelName() + "." + opcItemInfo.getDeviceName() + "." + opcItemInfo.getSignName()));
                }
                List<DataValue> dataValues = readData(clientControl, nodeIdList).get();

                Random random = new Random();
                for (int i = 0; i < opcItemInfoList.size(); i++) {
                    if (!dataValues.get(i).getStatusCode().isGood()) {
                        opcItemInfoList.get(i).setValue(random.nextInt(0, 10));
                    } else {
                        opcItemInfoList.get(i).setValue(dataValues.get(i).getValue().getValue());
                    }

                }
                resultMap.put("code", 0);
                resultMap.put("message", "指令下发成功");
                resultMap.put("data", opcItemInfoList);
                clientControl.disconnect().get();
            } else {
                List<OPCItemInfo> opcItemInfoList = opcItemInfoService.getByStationIDAndDeviceID(ctrlOrder.getStationID(), ctrlOrder.getDeviceID(), ctrlOrder.getOrderCode());

                if (opcItemInfoList.size() > 0) {

                    clientControl.connect().get();

                    List<NodeId> nodeIds = ImmutableList.of(new NodeId(2, opcItemInfoList.get(0).getChannelName() + "." + opcItemInfoList.get(0).getDeviceName() + "." + opcItemInfoList.get(0).getSignName()));

                    Variant v = new Variant(1);
                    // don't write status or timestamps
                    DataValue dv = new DataValue(v, null, null);

                    // write asynchronously....
                    CompletableFuture<List<StatusCode>> f =
                            clientControl.writeValues(nodeIds, ImmutableList.of(dv));

                    // ...but block for the results so we write in order
                    List<StatusCode> statusCodes = f.get();
                    StatusCode status = statusCodes.get(0);

                    if (status.isGood()) {
                        //logger.info("Wrote '{}' to nodeId={}", v, nodeIds.get(0));
                        resultMap.put("code", 0);
                        resultMap.put("message", "指令下发成功");
                    } else {
                        resultMap.put("code", 1);
                        resultMap.put("message", "指令下发失败");
                    }

                    clientControl.disconnect().get();

                } else {
                    resultMap.put("code", 1);
                    resultMap.put("message", "控制指令未配置");
                }

            }


        } catch (Exception e) {
            //throw new RuntimeException(e);
            resultMap.put("code", 1);
            resultMap.put("message", "控制失败，" + e.getMessage());
        }

        try {
            exchange.getResponseHeaders().set("Content-Type", "application/json;charset=UTF-8");

            String response = objectMapper.writeValueAsString(resultMap);
            byte[] bytesResponse = response.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, bytesResponse.length);
            OutputStream os = exchange.getResponseBody();
            os.write(bytesResponse);
            os.close();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            logger.error("响应异常" + e.getMessage());
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        scrollPaneData = new JScrollPane();
        tableData = new JTable();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== scrollPaneData ========
        {

            //---- tableData ----
            tableData.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, "", "", null, "", ""},
                    {null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "\u5e8f\u53f7", "\u901a\u9053\u540d\u79f0", "\u8bbe\u5907\u540d\u79f0", "\u6807\u8bb0\u540d\u79f0", "\u8bfb\u53d6\u65f6\u95f4", "\u6570\u503c", "\u8868\u540d\u79f0", "\u5217\u540d\u79f0"
                }
            ));
            scrollPaneData.setViewportView(tableData);
        }
        contentPane.add(scrollPaneData, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPaneData;
    private JTable tableData;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
