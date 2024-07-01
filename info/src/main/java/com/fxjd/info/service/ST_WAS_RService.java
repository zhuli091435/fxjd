package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_WAS_R;

import java.util.Date;
import java.util.List;

public interface ST_WAS_RService {
    ST_WAS_R getLatestBySTCD(String stcd);

    List<ST_WAS_R> getByTime(String stcd, Date beginTime, Date endTime);

    List<ST_WAS_R> getByLimit(Integer count, String stcd);
}
