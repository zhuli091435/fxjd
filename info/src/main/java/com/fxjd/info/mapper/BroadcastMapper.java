package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Broadcast;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BroadcastMapper {
    int deleteByPrimaryKey(Integer broadcastID);

    int insert(Broadcast row);

    Broadcast selectByPrimaryKey(Integer broadcastID);

    List<Broadcast> selectAll();

    int updateByPrimaryKey(Broadcast row);
}