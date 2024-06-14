package com.fxjd.info.mapper;

import com.fxjd.info.pojo.BroadcastFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BroadcastFileMapper {
    int deleteByPrimaryKey(Integer broadcastFileID);

    int insert(BroadcastFile row);

    BroadcastFile selectByPrimaryKey(Integer broadcastFileID);

    List<BroadcastFile> selectAll();

    int updateByPrimaryKey(BroadcastFile row);
}