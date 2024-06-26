package com.fxjd.info.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fxjd.info.pojo.*;
import com.fxjd.info.service.*;
import com.fxjd.info.utils.HttpHelper;
import com.fxjd.info.vo.PumpVO;
import com.fxjd.info.vo.ReqResult;
import com.fxjd.info.vo.StatVO;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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

    @RequestMapping("/real/data")
    public void getWaterPumpRealDataNew(String deviceName, HttpServletResponse response) throws IOException {

        PumpVO pumpVO = new PumpVO();
        String url = "http://localhost:8060/control";

        CtrlOrder ctrlOrder = new CtrlOrder();
        ctrlOrder.setOrderCode("01");
        ctrlOrder.setOrderParam(deviceName);
        ObjectMapper objectMapper = new ObjectMapper();
        String newString = objectMapper.writeValueAsString(ctrlOrder);

        response.addHeader("Content-Type", "application/json;charset=UTF-8");
        response.getWriter().write(HttpHelper.doPostJson(url, newString, null));

    }

    @RequestMapping("/pump/stat")
    public StatVO getGateStatData(String stcd) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.HOUR, -2);
        StatVO statVO = new StatVO(0, 0);
        List<ST_PUMP_B> st_pump_bList = st_pump_bService.getBySTCD(stcd).stream().filter(o -> o.getType().equals("提水泵站")).toList();
        for (ST_PUMP_B st_pump_b : st_pump_bList) {
            ST_PUMP_R pump = st_pump_rService.getLatestBySTCD(stcd, st_pump_b.getEQPNO());
            if (pump == null || pump.getTM().before(instance.getTime())) {
                statVO.setOffline(statVO.getOffline() + 1);
            } else {
                statVO.setOnline(statVO.getOnline() + 1);
            }
        }
        return statVO;
    }
}
