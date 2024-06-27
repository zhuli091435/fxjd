package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_WaveMaker_R;
import com.fxjd.info.pojo.ST_WaveMaker_RExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_WaveMaker_RMapper {
    long countByExample(ST_WaveMaker_RExample example);

    int deleteByExample(ST_WaveMaker_RExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ST_WaveMaker_R row);

    int insertSelective(ST_WaveMaker_R row);

    List<ST_WaveMaker_R> selectByExample(ST_WaveMaker_RExample example);

    ST_WaveMaker_R selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") ST_WaveMaker_R row, @Param("example") ST_WaveMaker_RExample example);

    int updateByExample(@Param("row") ST_WaveMaker_R row, @Param("example") ST_WaveMaker_RExample example);

    int updateByPrimaryKeySelective(ST_WaveMaker_R row);

    int updateByPrimaryKey(ST_WaveMaker_R row);

    ST_WaveMaker_R selectLatestBySTCD(String stcd);
}