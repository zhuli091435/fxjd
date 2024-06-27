package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.CtrlDetailsMapper;
import com.fxjd.info.mapper.ST_WaveMaker_RMapper;
import com.fxjd.info.pojo.ST_WaveMaker_R;
import com.fxjd.info.service.ST_WaveMaker_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ST_WaveMaker_RServiceImpl implements ST_WaveMaker_RService {
    @Resource
    private ST_WaveMaker_RMapper st_waveMaker_rMapper;

    @Override
    public ST_WaveMaker_R getLatestBySTCD(String stcd) {
        return st_waveMaker_rMapper.selectLatestBySTCD(stcd);
    }
}
