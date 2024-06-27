package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_PUMP_R;
import com.fxjd.info.pojo.ST_PUMP_RExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ST_PUMP_RMapper {
    long countByExample(ST_PUMP_RExample example);

    int deleteByExample(ST_PUMP_RExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ST_PUMP_R row);

    int insertSelective(ST_PUMP_R row);

    List<ST_PUMP_R> selectByExample(ST_PUMP_RExample example);

    ST_PUMP_R selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") ST_PUMP_R row, @Param("example") ST_PUMP_RExample example);

    int updateByExample(@Param("row") ST_PUMP_R row, @Param("example") ST_PUMP_RExample example);

    int updateByPrimaryKeySelective(ST_PUMP_R row);

    int updateByPrimaryKey(ST_PUMP_R row);

    ST_PUMP_R selectLatestBySTCD(@Param("stcd") String stcd, @Param("eqpno") String eqpno);
}