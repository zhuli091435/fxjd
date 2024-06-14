package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_PUMP_B;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_PUMP_BMapper {
    int deleteByPrimaryKey(@Param("STCD") String STCD, @Param("EQPNO") String EQPNO);

    int insert(ST_PUMP_B row);

    ST_PUMP_B selectByPrimaryKey(@Param("STCD") String STCD, @Param("EQPNO") String EQPNO);

    List<ST_PUMP_B> selectAll();

    int updateByPrimaryKey(ST_PUMP_B row);

    List<ST_PUMP_B> selectBySTCD(String stcd);
}