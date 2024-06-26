package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_PUMP_BMapper;
import com.fxjd.info.pojo.ST_PUMP_B;
import com.fxjd.info.pojo.ST_PUMP_BExample;
import com.fxjd.info.service.ST_PUMP_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ST_PUMP_BServiceImpl implements ST_PUMP_BService {

    @Resource
    private ST_PUMP_BMapper st_pump_bMapper;

    @Override
    public List<ST_PUMP_B> getBySTCD(String stcd) {
        ST_PUMP_BExample stPumpBExample = new ST_PUMP_BExample();
        stPumpBExample.createCriteria().andSTCDEqualTo(stcd);
        return st_pump_bMapper.selectByExample(stPumpBExample);
    }
}
