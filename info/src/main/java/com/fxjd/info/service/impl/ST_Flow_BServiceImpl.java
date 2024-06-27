package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_Flow_BMapper;
import com.fxjd.info.mapper.ST_Flow_RMapper;
import com.fxjd.info.pojo.ST_Flow_B;
import com.fxjd.info.pojo.ST_Flow_BExample;
import com.fxjd.info.service.ST_Flow_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ST_Flow_BServiceImpl implements ST_Flow_BService {
    @Resource
    private ST_Flow_BMapper st_flow_bMapper;

    @Override
    public List<ST_Flow_B> getBySTCD(String stcd) {
        ST_Flow_BExample st_flow_bExample = new ST_Flow_BExample();
        st_flow_bExample.createCriteria().andSTCDEqualTo(stcd);
        return st_flow_bMapper.selectByExample(st_flow_bExample);
    }
}
