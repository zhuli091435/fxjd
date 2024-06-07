package com.fxjd.info.mapper;

import com.fxjd.info.pojo.BroadcastTaskRecord;
import java.util.List;

public interface BroadcastTaskRecordMapper {
    int deleteByPrimaryKey(Integer taskRecordID);

    int insert(BroadcastTaskRecord row);

    BroadcastTaskRecord selectByPrimaryKey(Integer taskRecordID);

    List<BroadcastTaskRecord> selectAll();

    int updateByPrimaryKey(BroadcastTaskRecord row);
}