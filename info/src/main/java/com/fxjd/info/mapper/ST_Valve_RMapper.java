package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_Valve_R;
import com.fxjd.info.pojo.ST_Valve_RExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_Valve_RMapper {
    long countByExample(ST_Valve_RExample example);

    int deleteByExample(ST_Valve_RExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ST_Valve_R row);

    int insertSelective(ST_Valve_R row);

    List<ST_Valve_R> selectByExample(ST_Valve_RExample example);

    ST_Valve_R selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") ST_Valve_R row, @Param("example") ST_Valve_RExample example);

    int updateByExample(@Param("row") ST_Valve_R row, @Param("example") ST_Valve_RExample example);

    int updateByPrimaryKeySelective(ST_Valve_R row);

    int updateByPrimaryKey(ST_Valve_R row);

    ST_Valve_R selectLatestBySTCD(@Param("stcd") String stcd, @Param("eqpno") String eqpno);
}