package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_STBPRP_B;
import java.util.List;

public interface ST_STBPRP_BMapper {
    int deleteByPrimaryKey(String STCD);

    int insert(ST_STBPRP_B row);

    ST_STBPRP_B selectByPrimaryKey(String STCD);

    List<ST_STBPRP_B> selectAll();

    int updateByPrimaryKey(ST_STBPRP_B row);
}