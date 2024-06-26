package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_H_GATE_R;
import com.fxjd.info.pojo.ST_H_GATE_RExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ST_H_GATE_RMapper {
    long countByExample(ST_H_GATE_RExample example);

    int deleteByExample(ST_H_GATE_RExample example);

    int insert(ST_H_GATE_R row);

    int insertSelective(ST_H_GATE_R row);

    List<ST_H_GATE_R> selectByExample(ST_H_GATE_RExample example);

    int updateByExampleSelective(@Param("row") ST_H_GATE_R row, @Param("example") ST_H_GATE_RExample example);

    int updateByExample(@Param("row") ST_H_GATE_R row, @Param("example") ST_H_GATE_RExample example);

    ST_H_GATE_R selectLatestBySTCD(@Param("stcd") String stcd, @Param("eqpno") String eqpno);
}