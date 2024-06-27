package com.fxjd.info.controller;

import com.fxjd.info.pojo.*;
import com.fxjd.info.service.ST_GATE_BService;
import com.fxjd.info.service.ST_WaveMaker_RService;
import com.fxjd.info.vo.PumpVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ST_WaveMaker_RController {
    @Resource
    private ST_WaveMaker_RService st_waveMaker_rService;

    @RequestMapping("/real/wave")
    public ST_WaveMaker_R getWaveMakerData(String stcd) {
        return st_waveMaker_rService.getLatestBySTCD(stcd);
    }
}

