package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_H_GATE_R;
import java.util.List;

public interface ST_H_GATE_RMapper {
    int insert(ST_H_GATE_R row);

    List<ST_H_GATE_R> selectAll();
}