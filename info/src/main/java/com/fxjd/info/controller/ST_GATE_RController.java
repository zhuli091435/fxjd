package com.fxjd.info.controller;

import com.fxjd.info.pojo.*;
import com.fxjd.info.service.*;
import com.fxjd.info.vo.StatVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
public class ST_GATE_RController {
    @Resource
    private ST_GATE_RService st_gate_rService;

    @Resource
    private ST_GATE_BService st_gate_bService;

    @Resource
    private ST_H_GATE_RService st_h_gate_rService;

    @Resource
    private ST_H_GATE_BService st_h_gate_bService;

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

    @RequestMapping("/gate/stat")
    public StatVO getGateStatData(String stcd) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.HOUR, -2);
        StatVO statVO = new StatVO(0, 0);
        List<ST_GATE_B> st_gate_bList = st_gate_bService.getBySTCD(stcd);
        for (ST_GATE_B stGateB : st_gate_bList) {
            ST_GATE_R gateR = st_gate_rService.getLatestBySTCD(stcd, stGateB.getEQPNO());
            if (gateR == null || gateR.getTM().before(instance.getTime())) {
                statVO.setOffline(statVO.getOffline() + 1);
            } else {
                statVO.setOnline(statVO.getOnline() + 1);
            }
        }

        List<ST_H_GATE_B> st_h_gate_bList = st_h_gate_bService.getBySTCD(stcd);
        for (ST_H_GATE_B st_h_gate_b : st_h_gate_bList) {
            ST_H_GATE_R gateR = st_h_gate_rService.getLatestBySTCD(stcd, st_h_gate_b.getEQPNO());
            if (gateR == null || gateR.getTM().before(instance.getTime())) {
                statVO.setOffline(statVO.getOffline() + 1);
            } else {
                statVO.setOnline(statVO.getOnline() + 1);
            }
        }
        return statVO;
    }
}
