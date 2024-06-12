package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_STBPRP_BMapper;
import com.fxjd.info.pojo.ST_STBPRP_B;
import com.fxjd.info.service.ST_STBPRP_BService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ST_STBPRP_BServiceImpl implements ST_STBPRP_BService {

    @Resource
    private ST_STBPRP_BMapper stStbprpBMapper;

    @Override
    public ST_STBPRP_B getBySTCD(String stcd) {
        return stStbprpBMapper.selectByPrimaryKey(stcd);
    }
}
