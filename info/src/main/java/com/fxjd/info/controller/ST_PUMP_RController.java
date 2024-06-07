package com.fxjd.info.controller;

import com.fxjd.info.pojo.ST_PUMP_R;
import com.fxjd.info.service.ST_PUMP_RService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ST_PUMP_RController {

    @Resource
    private ST_PUMP_RService st_pump_rService;

    @RequestMapping("/real/pump")
    public void getWaterPumpRealData(String stcd) {
        ST_PUMP_R stPumpR = st_pump_rService.getLatestBySTCD(stcd);
    }
}