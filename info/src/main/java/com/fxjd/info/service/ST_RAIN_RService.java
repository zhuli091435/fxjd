package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_RAIN_R;

public interface ST_RAIN_RService {
    ST_RAIN_R getLatestBySTCDAndEQPNO(String stcd, String eqpno);
}
