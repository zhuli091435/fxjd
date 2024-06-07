package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_PUMP_R;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ST_PUMP_RMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(ST_PUMP_R row);

    ST_PUMP_R selectByPrimaryKey(Integer ID);

    List<ST_PUMP_R> selectAll();

    int updateByPrimaryKey(ST_PUMP_R row);

    ST_PUMP_R selectLatestBySTCD(@Param(value = "stcd") String stcd, @Param(value = "eqpno") String eqpno);
}