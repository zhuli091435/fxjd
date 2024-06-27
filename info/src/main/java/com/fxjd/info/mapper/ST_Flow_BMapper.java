package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_Flow_B;
import com.fxjd.info.pojo.ST_Flow_BExample;
import com.fxjd.info.pojo.ST_Flow_BKey;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_Flow_BMapper {
    long countByExample(ST_Flow_BExample example);

    int deleteByExample(ST_Flow_BExample example);

    int deleteByPrimaryKey(ST_Flow_BKey key);

    int insert(ST_Flow_B row);

    int insertSelective(ST_Flow_B row);

    List<ST_Flow_B> selectByExample(ST_Flow_BExample example);

    ST_Flow_B selectByPrimaryKey(ST_Flow_BKey key);

    int updateByExampleSelective(@Param("row") ST_Flow_B row, @Param("example") ST_Flow_BExample example);

    int updateByExample(@Param("row") ST_Flow_B row, @Param("example") ST_Flow_BExample example);

    int updateByPrimaryKeySelective(ST_Flow_B row);

    int updateByPrimaryKey(ST_Flow_B row);
}