package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_PUMP_R;

public interface ST_PUMP_RService {
    ST_PUMP_R getLatestBySTCD(String stcd, String equno);
}
