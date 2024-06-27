package com.fxjd.info.mapper;

import com.fxjd.info.pojo.BroadcastTaskTemplete;
import com.fxjd.info.pojo.BroadcastTaskTempleteExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BroadcastTaskTempleteMapper {
    long countByExample(BroadcastTaskTempleteExample example);

    int deleteByExample(BroadcastTaskTempleteExample example);

    int deleteByPrimaryKey(Integer templeteID);

    int insert(BroadcastTaskTemplete row);

    int insertSelective(BroadcastTaskTemplete row);

    List<BroadcastTaskTemplete> selectByExample(BroadcastTaskTempleteExample example);

    BroadcastTaskTemplete selectByPrimaryKey(Integer templeteID);

    int updateByExampleSelective(@Param("row") BroadcastTaskTemplete row, @Param("example") BroadcastTaskTempleteExample example);

    int updateByExample(@Param("row") BroadcastTaskTemplete row, @Param("example") BroadcastTaskTempleteExample example);

    int updateByPrimaryKeySelective(BroadcastTaskTemplete row);

    int updateByPrimaryKey(BroadcastTaskTemplete row);
}