package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_GATE_RMapper;
import com.fxjd.info.mapper.ST_PUMP_RMapper;
import com.fxjd.info.pojo.ST_GATE_R;
import com.fxjd.info.pojo.ST_PUMP_R;
import com.fxjd.info.service.ST_GATE_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ST_GATE_RServiceImpl implements ST_GATE_RService {
    @Resource
    private ST_GATE_RMapper st_gate_rMapper;

    @Override
    public ST_GATE_R getLatestBySTCD(String stcd, String eqpno) {
        return st_gate_rMapper.selectLatestBySTCD(stcd, eqpno);
    }
}
