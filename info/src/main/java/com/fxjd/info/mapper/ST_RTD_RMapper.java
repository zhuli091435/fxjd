package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_RTD_R;
import com.fxjd.info.pojo.ST_RTD_RExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ST_RTD_RMapper {
    long countByExample(ST_RTD_RExample example);

    int deleteByExample(ST_RTD_RExample example);

    int insert(ST_RTD_R row);

    int insertSelective(ST_RTD_R row);

    List<ST_RTD_R> selectByExample(ST_RTD_RExample example);

    int updateByExampleSelective(@Param("row") ST_RTD_R row, @Param("example") ST_RTD_RExample example);

    int updateByExample(@Param("row") ST_RTD_R row, @Param("example") ST_RTD_RExample example);
}