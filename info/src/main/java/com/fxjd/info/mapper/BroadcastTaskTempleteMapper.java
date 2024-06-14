package com.fxjd.info.mapper;

import com.fxjd.info.pojo.BroadcastTaskTemplete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BroadcastTaskTempleteMapper {
    int deleteByPrimaryKey(Integer templeteID);

    int insert(BroadcastTaskTemplete row);

    BroadcastTaskTemplete selectByPrimaryKey(Integer templeteID);

    List<BroadcastTaskTemplete> selectAll();

    int updateByPrimaryKey(BroadcastTaskTemplete row);
}