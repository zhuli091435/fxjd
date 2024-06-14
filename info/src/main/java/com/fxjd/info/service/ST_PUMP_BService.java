package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_PUMP_B;

import java.util.Collection;
import java.util.List;

public interface ST_PUMP_BService {
    List<ST_PUMP_B> getBySTCD(String stcd);
}
