package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_RAIN_R;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ST_RAIN_RMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(ST_RAIN_R row);

    ST_RAIN_R selectByPrimaryKey(Integer ID);

    List<ST_RAIN_R> selectAll();

    int updateByPrimaryKey(ST_RAIN_R row);

    ST_RAIN_R getLatestBySTCDAndEQPNO(@Param("stcd") String stcd, @Param("eqpno") String eqpno);
}