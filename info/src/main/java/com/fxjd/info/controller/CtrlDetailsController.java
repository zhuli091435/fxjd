package com.fxjd.info.controller;

import com.fxjd.info.pojo.CtrlDetails;
import com.fxjd.info.pojo.CtrlRecord;
import com.fxjd.info.service.CtrlDetailsService;
import com.fxjd.info.service.CtrlRecordService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

@Controller
public class CtrlDetailsController {
    @Resource
    private CtrlDetailsService ctrlDetailsService;

    @RequestMapping("/getCtrlDetails")
    public List<CtrlDetails> getCtrlDetails(Integer ctrlRecordID) {
        return ctrlDetailsService.getByCtrlRecordID(ctrlRecordID);
    }
}
