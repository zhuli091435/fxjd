package com.fxjd.info.controller;

import com.fxjd.info.pojo.CtrlRecord;
import com.fxjd.info.service.CtrlRecordService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
public class CtrlRecordController {

    @Resource
    private CtrlRecordService ctrlRecordService;

    @RequestMapping("/addCtrlRecord")
    public HashMap<String, Object> addCtrlRecord(CtrlRecord ctrlRecord) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();

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
}
