package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_CABINET_BMapper;
import com.fxjd.info.mapper.ST_GATE_BMapper;
import com.fxjd.info.pojo.ST_CABINET_B;
import com.fxjd.info.pojo.ST_CABINET_BExample;
import com.fxjd.info.service.ST_CABINET_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ST_CABINET_BServiceImpl implements ST_CABINET_BService {
    @Resource
    private ST_CABINET_BMapper st_cabinet_bMapper;

    @Override
    public List<ST_CABINET_B> getBySTCD(String stcd) {
        ST_CABINET_BExample stCabinetBExample = new ST_CABINET_BExample();
        stCabinetBExample.createCriteria().andSTCDEqualTo(stcd);
        return st_cabinet_bMapper.selectByExample(stCabinetBExample);
    }
}
