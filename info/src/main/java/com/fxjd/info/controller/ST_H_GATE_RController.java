package com.fxjd.info.controller;

import com.fxjd.info.pojo.*;
import com.fxjd.info.service.*;
import com.fxjd.info.vo.CrackVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ST_H_GATE_RController {
    @Resource
    private ST_H_GATE_RService st_h_gate_rService;

    @Resource
    private ST_H_GATE_BService st_h_gate_bService;

    @Resource
    private ST_PUMP_RService st_pump_rService;

    @Resource
    private ST_PUMP_BService st_pump_bService;

    @RequestMapping("/real/landslide/gate")
    public List<ST_H_GATE_R> getAllLandslideRealData(String stcd) {
        List<ST_H_GATE_R> st_h_gate_rList = new ArrayList<>();
        List<ST_H_GATE_B> st_h_gate_bList = st_h_gate_bService.getBySTCD(stcd).stream().filter(o -> o.getGateType().equals("单门双缸")).toList();
        for (ST_H_GATE_B st_h_gate_b : st_h_gate_bList) {
            st_h_gate_rList.add(st_h_gate_rService.getLatestBySTCD(stcd, st_h_gate_b.getEQPNO()));
        }
        return st_h_gate_rList;
    }

    @RequestMapping("/real/hgate")
    public List<ST_H_GATE_R> getHydraulicGateRealData(String stcd, String eqpno) {
        List<ST_H_GATE_R> st_h_gate_rList = new ArrayList<>();
        st_h_gate_rList.add(st_h_gate_rService.getLatestBySTCD(stcd, eqpno));
        return st_h_gate_rList;
    }

    @RequestMapping("/real/crack/gate")
    public CrackVO getAllCrackGateRealData(String stcd) {
        CrackVO crackVO = new CrackVO();
        List<ST_H_GATE_R> st_h_gate_rList = new ArrayList<>();
        List<ST_H_GATE_B> st_h_gate_bList = st_h_gate_bService.getBySTCD(stcd).stream().filter(o -> o.getGateType().equals("双门双缸")).toList();
        for (ST_H_GATE_B st_h_gate_b : st_h_gate_bList) {
            st_h_gate_rList.add(st_h_gate_rService.getLatestBySTCD(stcd, st_h_gate_b.getEQPNO()));
        }
        crackVO.setGateList(st_h_gate_rList);

        List<ST_PUMP_R> st_pump_rList = new ArrayList<>();
        List<ST_PUMP_B> st_pump_bList = st_pump_bService.getBySTCD(stcd).stream().filter(o -> o.getType().equals("裂缝")).toList();
        for (ST_PUMP_B st_pump_b : st_pump_bList) {
            st_pump_rList.add(st_pump_rService.getLatestBySTCD(stcd, st_pump_b.getEQPNO()));
        }
        crackVO.setPumpList(st_pump_rList);
        return crackVO;
    }
}
