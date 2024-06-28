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
import jakarta.annotation.Resource;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.fxjd.info.pojo.CtrlOrder.*;

@RestController
public class CtrlOrderController extends ParentController {
    @Resource
    private CtrlOrderService ctrlOrderService;

    @Resource
    private CtrlDetailsService ctrlDetailsService;

    @Resource
    private ST_STBPRP_BService stStbprpBService;

    @RequestMapping("/addCtrlOrder")
    public HashMap<String, Object> addCtrlOrder(CtrlOrder ctrlOrder) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ctrlOrder.setTime(new Date());
        int res = ctrlOrderService.add(ctrlOrder);
        if (res > 0) {

            String content = getContentByCode(ctrlOrder.getOrderCode());
            CtrlDetails ctrlDetails = new CtrlDetails();
            ctrlDetails.setCtrlRecordID(ctrlOrder.getCtrlRecordID());
            ObjectMapper objectMapper = new ObjectMapper();
            String newString = objectMapper.writeValueAsString(ctrlOrder);

            String url = "http://localhost:8060/control";

            try {
                String result = HttpHelper.doPostJson(url, newString, null);
                ReqResult reqResult = objectMapper.readValue(result, ReqResult.class);
                if (reqResult.getCode() == 0) {

                    ctrlDetails.setRecord(content + "指令执行成功！");
                    ctrlDetails.setTime(new Date());
                    ctrlDetailsService.add(ctrlDetails);

                    stringObjectHashMap.put("code", 0);
                    stringObjectHashMap.put("message", "");
                } else {
                    ctrlDetails.setRecord(content + "指令执行失败，" + reqResult.getMessage());
                    ctrlDetails.setTime(new Date());
                    ctrlDetailsService.add(ctrlDetails);

                    stringObjectHashMap.put("code", 1);
                    stringObjectHashMap.put("message", reqResult.getMessage());
                }
            } catch (Exception ex) {
                ctrlDetails.setRecord(content + "指令执行失败，" + ex.getMessage());
                ctrlDetails.setTime(new Date());
                ctrlDetailsService.add(ctrlDetails);

                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", content + "指令写入失败！，" + ex.getMessage());
            }

        } else {
            stringObjectHashMap.put("code", 1);
            stringObjectHashMap.put("message", "添加失败");
        }
        return stringObjectHashMap;
    }

    private String getContentByCode(String orderCode) {
        String content = "";
        switch (orderCode) {
            case GATE_OPEN:
                content = "开闸";
                break;
            case GATE_CLOSE:
                content = "关闸";
                break;
            case GATE_STOP:
                content = "停闸";
                break;
            case GATE_POSITION:
                content = "预设闸位";
                break;
            case GATE_MODE:
                content = "闸门操作模式";
                break;
            case PUMP_OPEN:
                content = "开泵";
                break;
            case PUMP_CLOSE:
                content = "关泵";
                break;
            case VALVE_OPEN:
                content = "开阀";
                break;
            case VALVE_CLOSE:
                content = "关阀";
                break;
            case WAVE_WORKMANSHIP:
                content = "造浪机工艺";
                break;
            case WAVE_COUNT:
                content = "造浪机设定循环次数";
                break;
            case WAVE_MANUAL:
                content = "造浪机手动模式";
                break;
            case WAVE_AUTO:
                content = "造浪机自动模式";
                break;
            case WAVE_OPEN:
                content = "造浪机启动";
                break;
            case WAVE_CLOSE:
                content = "造浪机停止";
                break;
            case WAVE_CRASH_CLOSE:
                content = "造浪机急停";
                break;
            case WAVE_RESET:
                content = "造浪机故障复位";
                break;
            case RAIN_CTRL:
                content = "人工降雨";
                break;
            default:
                break;
        }
        return content;
    }

}
