package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_CABINET_R;

public interface ST_CABINET_RService {
    ST_CABINET_R getLatestBySTCDAndEQPNO(String stcd, String eqpno);
}
