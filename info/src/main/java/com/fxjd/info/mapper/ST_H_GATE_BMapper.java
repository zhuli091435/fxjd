package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_H_GATE_B;
import com.fxjd.info.pojo.ST_H_GATE_BExample;
import com.fxjd.info.pojo.ST_H_GATE_BKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ST_H_GATE_BMapper {
    long countByExample(ST_H_GATE_BExample example);

    int deleteByExample(ST_H_GATE_BExample example);

    int deleteByPrimaryKey(ST_H_GATE_BKey key);

    int insert(ST_H_GATE_B row);

    int insertSelective(ST_H_GATE_B row);

    List<ST_H_GATE_B> selectByExample(ST_H_GATE_BExample example);

    ST_H_GATE_B selectByPrimaryKey(ST_H_GATE_BKey key);

    int updateByExampleSelective(@Param("row") ST_H_GATE_B row, @Param("example") ST_H_GATE_BExample example);

    int updateByExample(@Param("row") ST_H_GATE_B row, @Param("example") ST_H_GATE_BExample example);

    int updateByPrimaryKeySelective(ST_H_GATE_B row);

    int updateByPrimaryKey(ST_H_GATE_B row);
}