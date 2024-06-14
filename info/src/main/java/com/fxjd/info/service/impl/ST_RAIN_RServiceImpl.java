package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_RAIN_RMapper;
import com.fxjd.info.pojo.ST_RAIN_R;
import com.fxjd.info.service.ST_RAIN_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ST_RAIN_RServiceImpl implements ST_RAIN_RService {
    @Resource
    private ST_RAIN_RMapper st_rain_rMapper;

    @Override
    public ST_RAIN_R getLatestBySTCDAndEQPNO(String stcd, String eqpno) {
        return st_rain_rMapper.getLatestBySTCDAndEQPNO(stcd, eqpno);
    }
}
