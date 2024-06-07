package com.fxjd.info.mapper;

import com.fxjd.info.pojo.BroadcastTaskTemplete;
import java.util.List;

public interface BroadcastTaskTempleteMapper {
    int deleteByPrimaryKey(Integer templeteID);

    int insert(BroadcastTaskTemplete row);

    BroadcastTaskTemplete selectByPrimaryKey(Integer templeteID);

    List<BroadcastTaskTemplete> selectAll();

    int updateByPrimaryKey(BroadcastTaskTemplete row);
}