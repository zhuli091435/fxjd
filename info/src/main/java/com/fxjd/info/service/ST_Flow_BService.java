package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_Flow_B;

import java.util.Collection;
import java.util.List;

public interface ST_Flow_BService {
    List<ST_Flow_B> getBySTCD(String stcd);
}
