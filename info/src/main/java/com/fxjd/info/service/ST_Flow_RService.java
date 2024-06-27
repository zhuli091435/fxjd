package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_Flow_R;

public interface ST_Flow_RService {
    ST_Flow_R getLatestBySTCD(String stcd, String eqpno);
}
