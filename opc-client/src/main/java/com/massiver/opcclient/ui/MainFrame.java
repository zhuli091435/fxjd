/*
 * Created by JFormDesigner on Mon Jun 17 09:26:48 CST 2024
 */

package com.massiver.opcclient.ui;

import javax.swing.table.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.massiver.opcclient.App;
import com.massiver.opcclient.pojo.OPCItemInfo;
import com.massiver.opcclient.service.DynamicService;
import com.massiver.opcclient.service.OPCItemInfoService;
import com.massiver.opcclient.service.impl.DynamicServiceImpl;
import com.massiver.opcclient.service.impl.OPCItemInfoServiceImpl;
import com.massiver.opcclient.utils.ExceptionUtil;
import com.massiver.opcclient.utils.OPCUAUtils;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.UaClient;
import org.eclipse.milo.opcua.stack.core.Identifiers;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.enumerated.ServerState;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
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
    OPCItemInfoService opcItemInfoService = new OPCItemInfoServiceImpl();
    DynamicService dynamicService = new DynamicServiceImpl();

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public MainFrame() {
        initComponents();
        initTable();
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
                    if (true || date.getMinutes() % 5 == 0) {
                        //获取所有标记
                        List<OPCItemInfo> opcItemInfoList = opcItemInfoService.getAll().stream().filter(o -> o.getSignType().equals("read")).toList();
                        //按照设备进行分组，分组读取数据
                        Map<String, List<OPCItemInfo>> opcItemInfoMap = opcItemInfoList.stream().collect(Collectors.groupingBy(OPCItemInfo::getDeviceName));

                        //连接OPC服务器
                        logger.info("开始连接OPC服务器");
                        UaClient uaClient = client.connect().get();
                        logger.info("完成连接OPC服务器");

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
                                opcItemInfos.get(i).setValue(dataValues.get(i).getValue().getValue());

                            }
                            Map<String, List<OPCItemInfo>> opcItemInfoValueMap = opcItemInfos.stream().collect(Collectors.groupingBy(OPCItemInfo::getDeviceID));
                            for (String deviceID : opcItemInfoValueMap.keySet()) {
                                if (!deviceID.equals("")) {
                                    savaData(opcItemInfoValueMap.get(deviceID), dateFormat);
                                }
                            }
                            logger.info("完成获取" + device + "数据");
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
                savaDataWithEQPNO(opcItemInfoValues, dateFormat);
                break;
        }
    }

    private void savaDataWithEQPNO(List<OPCItemInfo> opcItemInfoValues, String dateFormat) {
        String columnStr = "";
        String valueStr = "";
        for (OPCItemInfo opcItemInfoValue : opcItemInfoValues) {
            columnStr += opcItemInfoValue.getColumnName() + ", ";
            if (opcItemInfoValue.getValue() == null) {
                valueStr += "null, ";
            } else {
                valueStr += "'" + opcItemInfoValue.getValue() + "', ";
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

    private CompletableFuture<List<DataValue>> readData(OpcUaClient client, List<NodeId> nodeIds) {
        return client.readValues(0.0, TimestampsToReturn.Both, nodeIds);
    }

    private void startListenOrder() {

        Thread serverThread = new Thread(() -> {

            // 监听指定的端口
            ServerSocket serverSocket = null;
            try {
                //开始监听
                serverSocket = new ServerSocket(PORT);
                logger.info("在端口" + PORT + "启动监听成功！");
                while (true) {
                    //等待设备连接
                    Socket socket = serverSocket.accept();
                    //设备连接服务器成功
                    logger.info("客户端" + socket.getRemoteSocketAddress() + "连接成功");

                    //开启新线程处理设备数据的接收发送
                    handleClient(socket);
                }
            } catch (Exception e) {
                logger.error("在端口" + PORT + "启动监听失败，" + ExceptionUtil.getStackTrace(e));
                //关闭ServerSocket
                if (serverSocket != null) {
                    try {
                        serverSocket.close();
                    } catch (IOException ex) {
                        //throw new RuntimeException(ex);
                    }
                }
            }
        });


        serverThread.setDaemon(true);
        serverThread.start();
    }

    private void handleClient(Socket socket) {
        Thread thread = new Thread(() -> {
            // 建立好连接后，从socket中获取输入流，并建立缓冲区进行读取
            InputStream inputStream = null;
            try {
                //主动发送数据给设备
                //sendMessage("F1030000000000000C6161F2", socket);
                //获取输入流
                inputStream = socket.getInputStream();
                byte[] bytes = new byte[1024];
                int len;
                while ((len = inputStream.read(bytes)) != -1) {
                    try {

                        byte[] dataBytes = Arrays.copyOf(bytes, len);

                        handleMsg(dataBytes, socket);

                    } catch (Exception ex) {
                        logger.error("handleMsg发生错误，" + ExceptionUtil.getStackTrace(ex));
                    }
                }

                inputStream.close();
                socket.close();
                logger.info("客户端" + socket.getRemoteSocketAddress() + "下线");
            } catch (Exception e) {
                logger.error("读取异常" + e.getMessage());
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    socket.close();
                } catch (Exception ex) {
                    //logToTextArea(ex.getMessage());
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    private void handleMsg(byte[] dataBytes, Socket socket) throws Exception {
        String jsonString = new String(dataBytes, StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        //CtrlOrder ctrlOrder = mapper.readValue(jsonString, CtrlOrder.class);

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
                    new Object[][]{
                            {null, null, null, "", "", null, "", ""},
                            {null, null, null, null, null, null, null, null},
                    },
                    new String[]{
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
