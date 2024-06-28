package com.fxjd.info.controller;

import com.fxjd.info.pojo.CtrlRecord;
import com.fxjd.info.service.CtrlRecordService;
import jakarta.annotation.Resource;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class CtrlRecordController {

    @Resource
    private CtrlRecordService ctrlRecordService;

    @RequestMapping("/addCtrlRecord")
    public HashMap<String, Object> addCtrlRecord(CtrlRecord ctrlRecord) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ctrlRecord.setTime(new Date());
        int res = ctrlRecordService.add(ctrlRecord);
        if (res > 0) {
            stringObjectHashMap.put("code", 0);
            stringObjectHashMap.put("message", "");
            stringObjectHashMap.put("ctrlRecordID", ctrlRecord.getID());
        } else {
            stringObjectHashMap.put("code", 1);
            stringObjectHashMap.put("message", "添加失败");
            stringObjectHashMap.put("ctrlRecordID", null);
        }
        return stringObjectHashMap;
    }

    @RequestMapping("/getCtrlRecord")
    public HashMap<String, Object> getCtrlRecord(String stationID, String deviceID, Integer operator) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.MINUTE, -10);
        List<CtrlRecord> ctrlRecordList = ctrlRecordService.getByStationIDAndDeviceID(stationID, deviceID, operator, instance.getTime());
        if (ctrlRecordList.size() > 0) {
            stringObjectHashMap.put("code", 0);
            stringObjectHashMap.put("message", "");
            stringObjectHashMap.put("ctrlRecordID", ctrlRecordList.get(ctrlRecordList.size() - 1).getID());
        } else {

            stringObjectHashMap.put("code", 0);
            stringObjectHashMap.put("message", "");
            stringObjectHashMap.put("ctrlRecordID", 0);
        }
        return stringObjectHashMap;
    }

}
