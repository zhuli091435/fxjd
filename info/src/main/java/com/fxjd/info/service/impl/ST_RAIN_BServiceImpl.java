package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_RAIN_BMapper;
import com.fxjd.info.pojo.ST_RAIN_B;
import com.fxjd.info.service.ST_RAIN_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ST_RAIN_BServiceImpl implements ST_RAIN_BService {
    @Resource
    private ST_RAIN_BMapper st_rain_bMapper;

    @Override
    public List<ST_RAIN_B> getBySTCD(String stcd) {
        return st_rain_bMapper.selectBySTCD(stcd);
    }
}
