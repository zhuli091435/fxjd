package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_Valve_R;

public interface ST_Valve_RService {
    ST_Valve_R getLatestBySTCD(String stcd, String eqpno);
}
