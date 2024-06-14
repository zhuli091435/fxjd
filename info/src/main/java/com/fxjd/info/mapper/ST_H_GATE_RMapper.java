package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_H_GATE_R;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ST_H_GATE_RMapper {
    int insert(ST_H_GATE_R row);

    List<ST_H_GATE_R> selectAll();

    ST_H_GATE_R selectLatestBySTCD(@Param("stcd") String stcd, @Param("eqpno") String eqpno);
}