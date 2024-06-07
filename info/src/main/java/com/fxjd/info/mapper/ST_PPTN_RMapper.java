package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_PPTN_R;
import java.util.List;

public interface ST_PPTN_RMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(ST_PPTN_R row);

    ST_PPTN_R selectByPrimaryKey(Integer ID);

    List<ST_PPTN_R> selectAll();

    int updateByPrimaryKey(ST_PPTN_R row);
}