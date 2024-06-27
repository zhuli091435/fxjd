package com.fxjd.info.controller;

import com.fxjd.info.pojo.ST_CABINET_B;
import com.fxjd.info.pojo.ST_CABINET_R;
import com.fxjd.info.pojo.ST_RAIN_B;
import com.fxjd.info.pojo.ST_RAIN_R;
import com.fxjd.info.service.ST_CABINET_BService;
import com.fxjd.info.service.ST_CABINET_RService;
import com.fxjd.info.service.ST_RAIN_BService;
import com.fxjd.info.service.ST_RAIN_RService;
import com.fxjd.info.vo.RainVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ST_RAIN_RController extends ParentController {

    @Resource
    private ST_RAIN_BService st_rain_bService;

    @Resource
    private ST_CABINET_BService st_cabinet_bService;

    @Resource
    private ST_RAIN_RService st_rain_rService;

    @Resource
    private ST_CABINET_RService st_cabinet_rService;

    @RequestMapping("/real/rain")
    public RainVO getRealRain(String stcd) {

        List<ST_RAIN_R> st_rain_rList = new ArrayList<>();
        List<ST_RAIN_B> st_rain_bList = st_rain_bService.getBySTCD(stcd);
        for (ST_RAIN_B stRainB : st_rain_bList) {
            st_rain_rList.add(st_rain_rService.getLatestBySTCDAndEQPNO(stcd, stRainB.getEQPNO()));
        }

        List<ST_CABINET_R> st_cabinet_rList = new ArrayList<>();
        List<ST_CABINET_B> st_cabinet_bList = st_cabinet_bService.getBySTCD(stcd);
        for (ST_CABINET_B st_cabinet_b : st_cabinet_bList) {
            st_cabinet_rList.add(st_cabinet_rService.getLatestBySTCDAndEQPNO(stcd, st_cabinet_b.getEQPNO()));
        }
        return new RainVO(st_cabinet_rList, st_rain_rList);
    }
}
