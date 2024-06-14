package com.fxjd.info.service;

import com.fxjd.info.pojo.ST_H_GATE_B;

import java.util.List;

public interface ST_H_GATE_BService {
    List<ST_H_GATE_B> getBySTCD(String stcd);
}
