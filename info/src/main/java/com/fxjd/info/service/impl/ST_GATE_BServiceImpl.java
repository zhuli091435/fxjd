package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_GATE_BMapper;
import com.fxjd.info.mapper.ST_H_GATE_BMapper;
import com.fxjd.info.pojo.ST_GATE_B;
import com.fxjd.info.service.ST_GATE_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ST_GATE_BServiceImpl implements ST_GATE_BService {
    @Resource
    private ST_GATE_BMapper st_gate_bMapper;

    @Override
    public List<ST_GATE_B> getBySTCD(String stcd) {
        return st_gate_bMapper.selectBySTCD(stcd);
    }
}
