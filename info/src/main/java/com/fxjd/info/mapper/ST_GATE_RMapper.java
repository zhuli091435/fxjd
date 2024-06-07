package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_GATE_R;
import java.util.List;

public interface ST_GATE_RMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(ST_GATE_R row);

    ST_GATE_R selectByPrimaryKey(Integer ID);

    List<ST_GATE_R> selectAll();

    int updateByPrimaryKey(ST_GATE_R row);
}