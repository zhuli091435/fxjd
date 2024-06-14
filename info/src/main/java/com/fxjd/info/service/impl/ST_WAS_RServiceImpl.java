package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_WAS_RMapper;
import com.fxjd.info.pojo.ST_WAS_R;
import com.fxjd.info.service.ST_WAS_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ST_WAS_RServiceImpl implements ST_WAS_RService {

    @Resource
    private ST_WAS_RMapper st_was_rMapper;

    @Override
    public ST_WAS_R getLatestBySTCD(String stcd) {
        return st_was_rMapper.selectLatestBySTCD(stcd);
    }
}
