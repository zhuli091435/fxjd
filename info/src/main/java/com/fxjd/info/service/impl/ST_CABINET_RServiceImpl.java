package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_CABINET_BMapper;
import com.fxjd.info.mapper.ST_CABINET_RMapper;
import com.fxjd.info.pojo.ST_CABINET_R;
import com.fxjd.info.service.ST_CABINET_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ST_CABINET_RServiceImpl implements ST_CABINET_RService {
    @Resource
    private ST_CABINET_RMapper st_cabinet_rMapper;

    @Override
    public ST_CABINET_R getLatestBySTCDAndEQPNO(String stcd, String eqpno) {
        return st_cabinet_rMapper.selectLatestBySTCDAndEQPNO(stcd, eqpno);
    }
}
