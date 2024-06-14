package com.fxjd.info.controller;

import com.fxjd.info.pojo.ST_GATE_B;
import com.fxjd.info.pojo.ST_GATE_R;
import com.fxjd.info.pojo.ST_PUMP_R;
import com.fxjd.info.service.ST_GATE_BService;
import com.fxjd.info.service.ST_GATE_RService;
import com.fxjd.info.service.ST_PUMP_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ST_GATE_RController {
    @Resource
    private ST_GATE_RService st_gate_rService;

    @Resource
    private ST_GATE_BService st_gate_bService;

    @RequestMapping("/real/gate")
    public ST_GATE_R getWaterPumpRealData(String stcd, String eqpno) {
        return st_gate_rService.getLatestBySTCD(stcd, eqpno);
    }

    @RequestMapping("/real/tsh/gate")
    public List<ST_GATE_R> getDrainageCulvertRealData(String stcd) {
        List<ST_GATE_R> st_gate_rList = new ArrayList<>();
        List<ST_GATE_B> st_gate_bList = st_gate_bService.getBySTCD(stcd).stream().filter(o -> o.getGateType().equals("退水涵闸")).toList();
        for (ST_GATE_B stGateB : st_gate_bList) {
            st_gate_rList.add(st_gate_rService.getLatestBySTCD(stcd, stGateB.getEQPNO()));
        }
        return st_gate_rList;
    }
}
