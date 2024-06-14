package com.fxjd.info.mapper;

import com.fxjd.info.pojo.BroadcastTaskRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BroadcastTaskRecordMapper {
    int deleteByPrimaryKey(Integer taskRecordID);

    int insert(BroadcastTaskRecord row);

    BroadcastTaskRecord selectByPrimaryKey(Integer taskRecordID);

    List<BroadcastTaskRecord> selectAll();

    int updateByPrimaryKey(BroadcastTaskRecord row);
}