package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_GATE_B;
import com.fxjd.info.pojo.ST_GATE_BExample;
import com.fxjd.info.pojo.ST_GATE_BKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ST_GATE_BMapper {
    long countByExample(ST_GATE_BExample example);

    int deleteByExample(ST_GATE_BExample example);

    int deleteByPrimaryKey(ST_GATE_BKey key);

    int insert(ST_GATE_B row);

    int insertSelective(ST_GATE_B row);

    List<ST_GATE_B> selectByExample(ST_GATE_BExample example);

    ST_GATE_B selectByPrimaryKey(ST_GATE_BKey key);

    int updateByExampleSelective(@Param("row") ST_GATE_B row, @Param("example") ST_GATE_BExample example);

    int updateByExample(@Param("row") ST_GATE_B row, @Param("example") ST_GATE_BExample example);

    int updateByPrimaryKeySelective(ST_GATE_B row);

    int updateByPrimaryKey(ST_GATE_B row);
}