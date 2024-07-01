package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.ST_WAS_RMapper;
import com.fxjd.info.pojo.ST_WAS_R;
import com.fxjd.info.pojo.ST_WAS_RExample;
import com.fxjd.info.service.ST_WAS_RService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ST_WAS_RServiceImpl implements ST_WAS_RService {

    @Resource
    private ST_WAS_RMapper st_was_rMapper;

    @Override
    public ST_WAS_R getLatestBySTCD(String stcd) {
        return st_was_rMapper.selectLatestBySTCD(stcd);
    }

    @Override
    public List<ST_WAS_R> getByTime(String stcd, Date beginTime, Date endTime) {
        ST_WAS_RExample st_was_rExample = new ST_WAS_RExample();
        st_was_rExample.createCriteria().andSTCDEqualTo(stcd).andTMBetween(beginTime, endTime);
        return st_was_rMapper.selectByExample(st_was_rExample);
    }

    @Override
    public List<ST_WAS_R> getByLimit(Integer count, String stcd) {
        return st_was_rMapper.selectByLimit(count, stcd);
    }
}
