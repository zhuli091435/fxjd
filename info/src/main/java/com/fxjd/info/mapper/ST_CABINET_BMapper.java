package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_CABINET_B;
import com.fxjd.info.pojo.ST_CABINET_BExample;
import com.fxjd.info.pojo.ST_CABINET_BKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ST_CABINET_BMapper {
    long countByExample(ST_CABINET_BExample example);

    int deleteByExample(ST_CABINET_BExample example);

    int deleteByPrimaryKey(ST_CABINET_BKey key);

    int insert(ST_CABINET_B row);

    int insertSelective(ST_CABINET_B row);

    List<ST_CABINET_B> selectByExample(ST_CABINET_BExample example);

    ST_CABINET_B selectByPrimaryKey(ST_CABINET_BKey key);

    int updateByExampleSelective(@Param("row") ST_CABINET_B row, @Param("example") ST_CABINET_BExample example);

    int updateByExample(@Param("row") ST_CABINET_B row, @Param("example") ST_CABINET_BExample example);

    int updateByPrimaryKeySelective(ST_CABINET_B row);

    int updateByPrimaryKey(ST_CABINET_B row);
}