package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_GATE_R;
import com.fxjd.info.pojo.ST_PUMP_R;

public interface ST_GATE_RService {
    ST_GATE_R getLatestBySTCD(String stcd, String eqpno);
}
