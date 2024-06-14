package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_H_GATE_R;

public interface ST_H_GATE_RService {
    ST_H_GATE_R getLatestBySTCD(String stcd, String eqpno);
}
