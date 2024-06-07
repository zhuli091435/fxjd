package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_PUMP_RMapper;
import com.fxjd.info.pojo.ST_PUMP_R;
import com.fxjd.info.service.ST_PUMP_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ST_PUMP_RServiceImpl implements ST_PUMP_RService {

    @Resource
    private ST_PUMP_RMapper st_pump_rMapper;

    @Override
    public ST_PUMP_R getLatestBySTCD(String stcd, String eqpno) {
        return st_pump_rMapper.selectLatestBySTCD(stcd, eqpno);
    }
}
