package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_RAIN_B;

import java.util.List;

public interface ST_RAIN_BService {
    List<ST_RAIN_B> getBySTCD(String stcd);
}
