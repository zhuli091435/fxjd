package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Broadcast;
import com.fxjd.info.pojo.BroadcastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BroadcastMapper {
    long countByExample(BroadcastExample example);

    int deleteByExample(BroadcastExample example);

    int deleteByPrimaryKey(Integer broadcastID);

    int insert(Broadcast row);

    int insertSelective(Broadcast row);

    List<Broadcast> selectByExample(BroadcastExample example);

    Broadcast selectByPrimaryKey(Integer broadcastID);

    int updateByExampleSelective(@Param("row") Broadcast row, @Param("example") BroadcastExample example);

    int updateByExample(@Param("row") Broadcast row, @Param("example") BroadcastExample example);

    int updateByPrimaryKeySelective(Broadcast row);

    int updateByPrimaryKey(Broadcast row);
}