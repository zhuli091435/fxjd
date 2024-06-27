package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_CABINET_B;

import java.util.List;

public interface ST_CABINET_BService {
    List<ST_CABINET_B> getBySTCD(String stcd);
}
