package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_RAIN_R;
import com.fxjd.info.pojo.ST_RAIN_RExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ST_RAIN_RMapper {
    long countByExample(ST_RAIN_RExample example);

    int deleteByExample(ST_RAIN_RExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ST_RAIN_R row);

    int insertSelective(ST_RAIN_R row);

    List<ST_RAIN_R> selectByExample(ST_RAIN_RExample example);

    ST_RAIN_R selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") ST_RAIN_R row, @Param("example") ST_RAIN_RExample example);

    int updateByExample(@Param("row") ST_RAIN_R row, @Param("example") ST_RAIN_RExample example);

    int updateByPrimaryKeySelective(ST_RAIN_R row);

    int updateByPrimaryKey(ST_RAIN_R row);

    ST_RAIN_R getLatestBySTCDAndEQPNO(@Param("stcd") String stcd, @Param("eqpno") String eqpno);
}