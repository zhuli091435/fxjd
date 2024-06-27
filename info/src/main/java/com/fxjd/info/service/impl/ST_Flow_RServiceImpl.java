package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_Flow_RMapper;
import com.fxjd.info.pojo.ST_Flow_R;
import com.fxjd.info.service.ST_Flow_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ST_Flow_RServiceImpl implements ST_Flow_RService {
    @Resource
    private ST_Flow_RMapper st_flow_rMapper;

    @Override
    public ST_Flow_R getLatestBySTCD(String stcd, String eqpno) {
        return st_flow_rMapper.selectLatestBySTCD(stcd, eqpno);
    }
}
