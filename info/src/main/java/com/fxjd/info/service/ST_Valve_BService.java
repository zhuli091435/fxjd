package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_Valve_B;

import java.util.Collection;
import java.util.List;

public interface ST_Valve_BService {
    List<ST_Valve_B> getBySTCD(String stcd);
}
