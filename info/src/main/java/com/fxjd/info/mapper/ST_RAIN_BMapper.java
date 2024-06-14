package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_RAIN_B;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_RAIN_BMapper {
    int deleteByPrimaryKey(@Param("STCD") String STCD, @Param("EQPNO") String EQPNO);

    int insert(ST_RAIN_B row);

    ST_RAIN_B selectByPrimaryKey(@Param("STCD") String STCD, @Param("EQPNO") String EQPNO);

    List<ST_RAIN_B> selectAll();

    int updateByPrimaryKey(ST_RAIN_B row);

    List<ST_RAIN_B> selectBySTCD(String stcd);
}