package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_H_GATE_BMapper;
import com.fxjd.info.pojo.ST_H_GATE_B;
import com.fxjd.info.pojo.ST_H_GATE_BExample;
import com.fxjd.info.service.ST_H_GATE_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ST_H_GATE_BServiceImpl implements ST_H_GATE_BService {

    @Resource
    private ST_H_GATE_BMapper st_h_gate_bMapper;

    @Override
    public List<ST_H_GATE_B> getBySTCD(String stcd) {
        ST_H_GATE_BExample stHGateBExample = new ST_H_GATE_BExample();
        stHGateBExample.createCriteria().andSTCDEqualTo(stcd);
        return st_h_gate_bMapper.selectByExample(stHGateBExample);
    }
}
