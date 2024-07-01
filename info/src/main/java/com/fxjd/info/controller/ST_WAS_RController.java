package com.fxjd.info.controller;

import com.fxjd.info.pojo.ST_GATE_R;
import com.fxjd.info.pojo.ST_WAS_R;
import com.fxjd.info.service.ST_GATE_RService;
import com.fxjd.info.service.ST_WAS_RService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class ST_WAS_RController {

    @Resource
    private ST_WAS_RService st_was_rService;

    @RequestMapping("/real/was")
    public ST_WAS_R getWaterRealData(String stcd) {
        return st_was_rService.getLatestBySTCD(stcd);
    }

    @RequestMapping("/his/was")
    public List<ST_WAS_R> getWaterHistoryData(String stcd, String beginTime, String endTime) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return st_was_rService.getByTime(stcd, simpleDateFormat.parse(beginTime), simpleDateFormat.parse(endTime));
    }

    @RequestMapping("/his/was/{count}")
    public List<ST_WAS_R> getWaterHistory24Data(String stcd, @PathVariable Integer count) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return st_was_rService.getByLimit(count,stcd);
    }
}
