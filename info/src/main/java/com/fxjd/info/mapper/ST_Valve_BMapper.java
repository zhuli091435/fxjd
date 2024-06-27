package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_Valve_B;
import com.fxjd.info.pojo.ST_Valve_BExample;
import com.fxjd.info.pojo.ST_Valve_BKey;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_Valve_BMapper {
    long countByExample(ST_Valve_BExample example);

    int deleteByExample(ST_Valve_BExample example);

    int deleteByPrimaryKey(ST_Valve_BKey key);

    int insert(ST_Valve_B row);

    int insertSelective(ST_Valve_B row);

    List<ST_Valve_B> selectByExample(ST_Valve_BExample example);

    ST_Valve_B selectByPrimaryKey(ST_Valve_BKey key);

    int updateByExampleSelective(@Param("row") ST_Valve_B row, @Param("example") ST_Valve_BExample example);

    int updateByExample(@Param("row") ST_Valve_B row, @Param("example") ST_Valve_BExample example);

    int updateByPrimaryKeySelective(ST_Valve_B row);

    int updateByPrimaryKey(ST_Valve_B row);
}