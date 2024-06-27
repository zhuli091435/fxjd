package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_Flow_R;
import com.fxjd.info.pojo.ST_Flow_RExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_Flow_RMapper {
    long countByExample(ST_Flow_RExample example);

    int deleteByExample(ST_Flow_RExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ST_Flow_R row);

    int insertSelective(ST_Flow_R row);

    List<ST_Flow_R> selectByExample(ST_Flow_RExample example);

    ST_Flow_R selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") ST_Flow_R row, @Param("example") ST_Flow_RExample example);

    int updateByExample(@Param("row") ST_Flow_R row, @Param("example") ST_Flow_RExample example);

    int updateByPrimaryKeySelective(ST_Flow_R row);

    int updateByPrimaryKey(ST_Flow_R row);

    ST_Flow_R selectLatestBySTCD(@Param("stcd") String stcd, @Param("eqpno") String eqpno);
}