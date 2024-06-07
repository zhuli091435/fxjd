package com.fxjd.info.controller;

import com.fxjd.info.pojo.ST_GATE_R;
import com.fxjd.info.pojo.ST_PUMP_R;
import com.fxjd.info.service.ST_GATE_RService;
import com.fxjd.info.service.ST_PUMP_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ST_GATE_RController {
    @Resource
    private ST_GATE_RService st_gate_rService;

    @RequestMapping("/real/gate")
    public ST_GATE_R getWaterPumpRealData(String stcd, String eqpno) {
        return st_gate_rService.getLatestBySTCD(stcd, eqpno);
    }
}
