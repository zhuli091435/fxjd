package com.fxjd.info.mapper;

import com.fxjd.info.pojo.BroadcastFile;
import java.util.List;

public interface BroadcastFileMapper {
    int deleteByPrimaryKey(Integer broadcastFileID);

    int insert(BroadcastFile row);

    BroadcastFile selectByPrimaryKey(Integer broadcastFileID);

    List<BroadcastFile> selectAll();

    int updateByPrimaryKey(BroadcastFile row);
}