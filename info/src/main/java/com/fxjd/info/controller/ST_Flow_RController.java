package com.fxjd.info.controller;

import com.fxjd.info.pojo.*;
import com.fxjd.info.service.*;
import com.fxjd.info.vo.PumpVO;
import com.fxjd.info.vo.StatVO;
import com.fxjd.info.vo.ValveFlowVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
public class ST_Flow_RController {
    @Resource
    private ST_Flow_RService st_flow_rService;

    @Resource
    private ST_Flow_BService st_flow_bService;

    @Resource
    private ST_Valve_RService st_valve_rService;

    @Resource
    private ST_Valve_BService st_valve_bService;

    @RequestMapping("/real/piping")
    public ValveFlowVO getPipingData(String stcd) {


        List<ST_Flow_R> st_flow_rList = new ArrayList<>();
        List<ST_Flow_B> st_flow_bList = st_flow_bService.getBySTCD(stcd).stream().filter(o -> o.getFlowType().equals("管涌段")).toList();
        for (ST_Flow_B st_flow_b : st_flow_bList) {
            st_flow_rList.add(st_flow_rService.getLatestBySTCD(stcd, st_flow_b.getEQPNO()));
        }

        List<ST_Valve_R> st_valve_rList = new ArrayList<>();
        List<ST_Valve_B> st_valve_bList = st_valve_bService.getBySTCD(stcd).stream().filter(o -> o.getValveType().equals("管涌段")).toList();
        for (ST_Valve_B st_valve_b : st_valve_bList) {
            st_valve_rList.add(st_valve_rService.getLatestBySTCD(stcd, st_valve_b.getEQPNO()));
        }

        return new ValveFlowVO(st_flow_rList, st_valve_rList);
    }

    @RequestMapping("/real/seepage")
    public ValveFlowVO getSeepageData(String stcd) {


        List<ST_Flow_R> st_flow_rList = new ArrayList<>();
        List<ST_Flow_B> st_flow_bList = st_flow_bService.getBySTCD(stcd).stream().filter(o -> o.getFlowType().equals("散浸段")).toList();
        for (ST_Flow_B st_flow_b : st_flow_bList) {
            st_flow_rList.add(st_flow_rService.getLatestBySTCD(stcd, st_flow_b.getEQPNO()));
        }

        List<ST_Valve_R> st_valve_rList = new ArrayList<>();
        List<ST_Valve_B> st_valve_bList = st_valve_bService.getBySTCD(stcd).stream().filter(o -> o.getValveType().equals("散浸段")).toList();
        for (ST_Valve_B st_valve_b : st_valve_bList) {
            st_valve_rList.add(st_valve_rService.getLatestBySTCD(stcd, st_valve_b.getEQPNO()));
        }

        return new ValveFlowVO(st_flow_rList, st_valve_rList);
    }

    @RequestMapping("/real/leakage")
    public ValveFlowVO getLeakageData(String stcd) {


        List<ST_Flow_R> st_flow_rList = new ArrayList<>();
        List<ST_Flow_B> st_flow_bList = st_flow_bService.getBySTCD(stcd).stream().filter(o -> o.getFlowType().equals("接触渗漏段")).toList();
        for (ST_Flow_B st_flow_b : st_flow_bList) {
            st_flow_rList.add(st_flow_rService.getLatestBySTCD(stcd, st_flow_b.getEQPNO()));
        }

        List<ST_Valve_R> st_valve_rList = new ArrayList<>();
        List<ST_Valve_B> st_valve_bList = st_valve_bService.getBySTCD(stcd).stream().filter(o -> o.getValveType().equals("接触渗漏段")).toList();
        for (ST_Valve_B st_valve_b : st_valve_bList) {
            st_valve_rList.add(st_valve_rService.getLatestBySTCD(stcd, st_valve_b.getEQPNO()));
        }

        return new ValveFlowVO(st_flow_rList, st_valve_rList);
    }

    //loophole
    @RequestMapping("/real/loophole")
    public ValveFlowVO getLoopholeData(String stcd) {


        List<ST_Flow_R> st_flow_rList = new ArrayList<>();
        List<ST_Flow_B> st_flow_bList = st_flow_bService.getBySTCD(stcd).stream().filter(o -> o.getFlowType().equals("漏洞段")).toList();
        for (ST_Flow_B st_flow_b : st_flow_bList) {
            st_flow_rList.add(st_flow_rService.getLatestBySTCD(stcd, st_flow_b.getEQPNO()));
        }

        List<ST_Valve_R> st_valve_rList = new ArrayList<>();
        List<ST_Valve_B> st_valve_bList = st_valve_bService.getBySTCD(stcd).stream().filter(o -> o.getValveType().equals("漏洞段")).toList();
        for (ST_Valve_B st_valve_b : st_valve_bList) {
            st_valve_rList.add(st_valve_rService.getLatestBySTCD(stcd, st_valve_b.getEQPNO()));
        }

        return new ValveFlowVO(st_flow_rList, st_valve_rList);
    }

    @RequestMapping("/valve/stat")
    public StatVO getGateStatData(String stcd) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.HOUR, -2);
        StatVO statVO = new StatVO(0, 0);

        List<ST_Valve_B> st_valve_bList = st_valve_bService.getBySTCD(stcd);
        for (ST_Valve_B st_valve_b : st_valve_bList) {
            ST_Valve_R valveR = st_valve_rService.getLatestBySTCD(stcd, st_valve_b.getEQPNO());
            if (valveR == null || valveR.getTM().before(instance.getTime())) {
                statVO.setOffline(statVO.getOffline() + 1);
            } else {
                statVO.setOnline(statVO.getOnline() + 1);
            }
        }
        return statVO;
    }
}

