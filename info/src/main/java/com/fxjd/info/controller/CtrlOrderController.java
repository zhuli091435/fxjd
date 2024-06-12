package com.fxjd.info.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fxjd.info.pojo.CtrlDetails;
import com.fxjd.info.pojo.CtrlOrder;
import com.fxjd.info.pojo.CtrlRecord;
import com.fxjd.info.pojo.ST_STBPRP_B;
import com.fxjd.info.service.CtrlDetailsService;
import com.fxjd.info.service.CtrlOrderService;
import com.fxjd.info.service.CtrlRecordService;
import com.fxjd.info.service.ST_STBPRP_BService;
import com.fxjd.info.utils.HttpHelper;
import com.fxjd.info.vo.ReqResult;
import com.fxjd.info.vo.SendOrder;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CtrlOrderController {
    @Resource
    private CtrlOrderService ctrlOrderService;

    @Resource
    private CtrlDetailsService ctrlDetailsService;

    @Resource
    private ST_STBPRP_BService stStbprpBService;

    @RequestMapping("/addCtrlOrder")
    public HashMap<String, Object> addCtrlOrder(CtrlOrder ctrlOrder) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        int res = ctrlOrderService.add(ctrlOrder);
        if (res > 0) {

            CtrlDetails ctrlDetails = new CtrlDetails();
            String content = "";
            switch (ctrlOrder.getState()) {
                case "1064":
                    content = "上升指令";
                    break;
                case "1065":
                    content = "停止指令";
                    break;
                case "1066":
                    content = "下降指令";
                    break;
                case "1067":
                    content = "预设闸位指令";
                    break;
                case "1068":
                    content = "断路器合闸";
                    break;
                case "1069":
                    content = "断路器分闸";
                    break;
                case "1070":
                    content = "闸门消除报警";
                    break;
                case "1":
                    content = "启动";
                    break;
                case "0":
                    content = "停止";
                    break;
                default:
                    break;
            }
            ctrlDetails.setCtrlRecordID(ctrlOrder.getID());
            ctrlDetails.setTime(new Date());
            ctrlDetails.setRecord(content + "已写入，请等待...");

            ctrlDetailsService.add(ctrlDetails);
            ST_STBPRP_B stStbprpB = stStbprpBService.getBySTCD(ctrlOrder.getStationID());
            if (stStbprpB != null) {

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                SendOrder sendOrder = new SendOrder();
                sendOrder.setStationID(stStbprpB.getRelationSTCD());
                sendOrder.setDeviceID(ctrlOrder.getDeviceID());
                sendOrder.setTime(simpleDateFormat.format(new Date()));
                sendOrder.setUserID(ctrlOrder.getUserID());
                sendOrder.setState(ctrlOrder.getState());
                sendOrder.setGTOPHGT(Double.parseDouble(ctrlOrder.getState()));
                sendOrder.setCtrlRecordID(ctrlOrder.getCtrlRecordID());
                sendOrder.setIsExecute(0);

                ObjectMapper objectMapper = new ObjectMapper();
                String newString = objectMapper.writeValueAsString(sendOrder);

                String url = "http://localhost:8060/";

                try {
                    String result = HttpHelper.doPostJson(url, newString, null);
                    ReqResult reqResult = objectMapper.readValue(result, ReqResult.class);
                    if (reqResult.getCode() == 0) {
                        stringObjectHashMap.put("code", 0);
                        stringObjectHashMap.put("message", "");
                    } else {
                        ctrlDetails.setRecord(content + "指令写入失败！");
                        ctrlDetails.setTime(new Date());
                        ctrlDetailsService.add(ctrlDetails);
                        stringObjectHashMap.put("code", 1);
                        stringObjectHashMap.put("message", reqResult.getData());
                    }
                } catch (Exception ex) {
                    ctrlDetails.setRecord(content + "指令写入失败！");
                    ctrlDetails.setTime(new Date());
                    ctrlDetailsService.add(ctrlDetails);
                    stringObjectHashMap.put("code", 1);
                    stringObjectHashMap.put("message", ex.getMessage());
                }
            } else {
                ctrlDetails.setRecord(content + "指令写入失败！");
                ctrlDetails.setTime(new Date());
                ctrlDetailsService.add(ctrlDetails);
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "无关联设备");
            }
        } else {
            stringObjectHashMap.put("code", 1);
            stringObjectHashMap.put("message", "添加失败");
        }
        return stringObjectHashMap;
    }
}
