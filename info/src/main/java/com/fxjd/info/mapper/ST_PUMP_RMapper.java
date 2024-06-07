package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_PUMP_R;

import java.util.List;

public interface ST_PUMP_RMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(ST_PUMP_R row);

    ST_PUMP_R selectByPrimaryKey(Integer ID);

    List<ST_PUMP_R> selectAll();

    int updateByPrimaryKey(ST_PUMP_R row);

    ST_PUMP_R selectLatestBySTCD(String stcd);
}