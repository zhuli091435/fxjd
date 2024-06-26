package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_STBPRP_B;
import com.fxjd.info.pojo.ST_STBPRP_BExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ST_STBPRP_BMapper {
    long countByExample(ST_STBPRP_BExample example);

    int deleteByExample(ST_STBPRP_BExample example);

    int deleteByPrimaryKey(String STCD);

    int insert(ST_STBPRP_B row);

    int insertSelective(ST_STBPRP_B row);

    List<ST_STBPRP_B> selectByExample(ST_STBPRP_BExample example);

    ST_STBPRP_B selectByPrimaryKey(String STCD);

    int updateByExampleSelective(@Param("row") ST_STBPRP_B row, @Param("example") ST_STBPRP_BExample example);

    int updateByExample(@Param("row") ST_STBPRP_B row, @Param("example") ST_STBPRP_BExample example);

    int updateByPrimaryKeySelective(ST_STBPRP_B row);

    int updateByPrimaryKey(ST_STBPRP_B row);
}