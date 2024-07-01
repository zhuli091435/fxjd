package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_WAS_R;
import com.fxjd.info.pojo.ST_WAS_RExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_WAS_RMapper {
    long countByExample(ST_WAS_RExample example);

    int deleteByExample(ST_WAS_RExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ST_WAS_R row);

    int insertSelective(ST_WAS_R row);

    List<ST_WAS_R> selectByExample(ST_WAS_RExample example);

    ST_WAS_R selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") ST_WAS_R row, @Param("example") ST_WAS_RExample example);

    int updateByExample(@Param("row") ST_WAS_R row, @Param("example") ST_WAS_RExample example);

    int updateByPrimaryKeySelective(ST_WAS_R row);

    int updateByPrimaryKey(ST_WAS_R row);

    ST_WAS_R selectLatestBySTCD(String stcd);

    List<ST_WAS_R> selectByLimit(@Param("count") int count, @Param("stcd") String stcd);
}