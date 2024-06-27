package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_RAIN_B;
import com.fxjd.info.pojo.ST_RAIN_BExample;
import com.fxjd.info.pojo.ST_RAIN_BKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ST_RAIN_BMapper {
    long countByExample(ST_RAIN_BExample example);

    int deleteByExample(ST_RAIN_BExample example);

    int deleteByPrimaryKey(ST_RAIN_BKey key);

    int insert(ST_RAIN_B row);

    int insertSelective(ST_RAIN_B row);

    List<ST_RAIN_B> selectByExample(ST_RAIN_BExample example);

    ST_RAIN_B selectByPrimaryKey(ST_RAIN_BKey key);

    int updateByExampleSelective(@Param("row") ST_RAIN_B row, @Param("example") ST_RAIN_BExample example);

    int updateByExample(@Param("row") ST_RAIN_B row, @Param("example") ST_RAIN_BExample example);

    int updateByPrimaryKeySelective(ST_RAIN_B row);

    int updateByPrimaryKey(ST_RAIN_B row);
}