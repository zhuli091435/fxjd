package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Broadcast;
import java.util.List;

public interface BroadcastMapper {
    int deleteByPrimaryKey(Integer broadcastID);

    int insert(Broadcast row);

    Broadcast selectByPrimaryKey(Integer broadcastID);

    List<Broadcast> selectAll();

    int updateByPrimaryKey(Broadcast row);
}