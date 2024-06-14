package com.fxjd.info.controller;

import com.fxjd.info.pojo.ST_GATE_R;
import com.fxjd.info.pojo.ST_WAS_R;
import com.fxjd.info.service.ST_GATE_RService;
import com.fxjd.info.service.ST_WAS_RService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ST_WAS_RController {

    @Resource
    private ST_WAS_RService st_was_rService;

    @RequestMapping("/real/was")
    public ST_WAS_R getWateRealData(String stcd) {
        return st_was_rService.getLatestBySTCD(stcd);
    }
}
