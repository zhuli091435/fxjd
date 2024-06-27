package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_Flow_RMapper;
import com.fxjd.info.mapper.ST_Valve_RMapper;
import com.fxjd.info.pojo.ST_Valve_R;
import com.fxjd.info.service.ST_Valve_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ST_Valve_RServiceImpl implements ST_Valve_RService {
    @Resource
    private ST_Valve_RMapper st_valve_rMapper;
    @Override
    public ST_Valve_R getLatestBySTCD(String stcd, String eqpno) {
        return st_valve_rMapper.selectLatestBySTCD(stcd,eqpno);
    }
}
