package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_CABINET_R;
import com.fxjd.info.pojo.ST_CABINET_RExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_CABINET_RMapper {
    long countByExample(ST_CABINET_RExample example);

    int deleteByExample(ST_CABINET_RExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ST_CABINET_R row);

    int insertSelective(ST_CABINET_R row);

    List<ST_CABINET_R> selectByExample(ST_CABINET_RExample example);

    ST_CABINET_R selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") ST_CABINET_R row, @Param("example") ST_CABINET_RExample example);

    int updateByExample(@Param("row") ST_CABINET_R row, @Param("example") ST_CABINET_RExample example);

    int updateByPrimaryKeySelective(ST_CABINET_R row);

    int updateByPrimaryKey(ST_CABINET_R row);

    ST_CABINET_R selectLatestBySTCDAndEQPNO(@Param("stcd") String stcd, @Param("eqpno") String eqpno);
}