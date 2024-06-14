package com.fxjd.info.controller;

import com.fxjd.info.pojo.ST_GATE_B;
import com.fxjd.info.pojo.ST_GATE_R;
import com.fxjd.info.pojo.ST_PUMP_B;
import com.fxjd.info.pojo.ST_PUMP_R;
import com.fxjd.info.service.*;
import com.fxjd.info.vo.PumpVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ST_PUMP_RController {

    @Resource
    private ST_PUMP_RService st_pump_rService;

    @Resource
    private ST_PUMP_BService st_pump_bService;
    @Resource
    private ST_WAS_RService st_was_rService;

    @Resource
    private ST_GATE_RService st_gate_rService;

    @Resource
    private ST_GATE_BService st_gate_bService;

    @RequestMapping("/real/pump")
    public PumpVO getWaterPumpRealData(String stcd) {

        PumpVO pumpVO = new PumpVO();
        pumpVO.setWaterLevel(st_was_rService.getLatestBySTCD(stcd));

        List<ST_GATE_R> st_gate_rList = new ArrayList<>();
        List<ST_GATE_B> st_gate_bList = st_gate_bService.getBySTCD(stcd).stream().filter(o -> o.getGateType().equals("提水泵站")).toList();
        for (ST_GATE_B stGateB : st_gate_bList) {
            st_gate_rList.add(st_gate_rService.getLatestBySTCD(stcd, stGateB.getEQPNO()));
        }
        pumpVO.setGates(st_gate_rList);


        List<ST_PUMP_R> st_pump_rList = new ArrayList<>();
        List<ST_PUMP_B> st_pump_bList = st_pump_bService.getBySTCD(stcd).stream().filter(o -> o.getType().equals("提水泵站")).toList();
        for (ST_PUMP_B st_pump_b : st_pump_bList) {
            st_pump_rList.add(st_pump_rService.getLatestBySTCD(stcd, st_pump_b.getEQPNO()));
        }
        pumpVO.setPumps(st_pump_rList);

        return pumpVO;
    }
}
