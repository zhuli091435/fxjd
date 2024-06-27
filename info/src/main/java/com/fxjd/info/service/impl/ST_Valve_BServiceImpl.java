package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_Valve_BMapper;
import com.fxjd.info.mapper.ST_WAS_RMapper;
import com.fxjd.info.pojo.ST_Flow_BExample;
import com.fxjd.info.pojo.ST_Valve_B;
import com.fxjd.info.pojo.ST_Valve_BExample;
import com.fxjd.info.service.ST_Valve_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ST_Valve_BServiceImpl implements ST_Valve_BService {
    @Resource
    private ST_Valve_BMapper st_valve_bMapper;

    @Override
    public List<ST_Valve_B> getBySTCD(String stcd) {
        ST_Valve_BExample st_valve_bExample = new ST_Valve_BExample();
        st_valve_bExample.createCriteria().andSTCDEqualTo(stcd);
        return st_valve_bMapper.selectByExample(st_valve_bExample);
    }
}
