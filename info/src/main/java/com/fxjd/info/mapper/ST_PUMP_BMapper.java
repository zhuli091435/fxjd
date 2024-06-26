package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_PUMP_B;
import com.fxjd.info.pojo.ST_PUMP_BExample;
import com.fxjd.info.pojo.ST_PUMP_BKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ST_PUMP_BMapper {
    long countByExample(ST_PUMP_BExample example);

    int deleteByExample(ST_PUMP_BExample example);

    int deleteByPrimaryKey(ST_PUMP_BKey key);

    int insert(ST_PUMP_B row);

    int insertSelective(ST_PUMP_B row);

    List<ST_PUMP_B> selectByExample(ST_PUMP_BExample example);

    ST_PUMP_B selectByPrimaryKey(ST_PUMP_BKey key);

    int updateByExampleSelective(@Param("row") ST_PUMP_B row, @Param("example") ST_PUMP_BExample example);

    int updateByExample(@Param("row") ST_PUMP_B row, @Param("example") ST_PUMP_BExample example);

    int updateByPrimaryKeySelective(ST_PUMP_B row);

    int updateByPrimaryKey(ST_PUMP_B row);
}