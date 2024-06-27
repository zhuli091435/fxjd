package com.fxjd.info.mapper;

import com.fxjd.info.pojo.BroadcastTaskRecord;
import com.fxjd.info.pojo.BroadcastTaskRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BroadcastTaskRecordMapper {
    long countByExample(BroadcastTaskRecordExample example);

    int deleteByExample(BroadcastTaskRecordExample example);

    int deleteByPrimaryKey(Integer taskRecordID);

    int insert(BroadcastTaskRecord row);

    int insertSelective(BroadcastTaskRecord row);

    List<BroadcastTaskRecord> selectByExample(BroadcastTaskRecordExample example);

    BroadcastTaskRecord selectByPrimaryKey(Integer taskRecordID);

    int updateByExampleSelective(@Param("row") BroadcastTaskRecord row, @Param("example") BroadcastTaskRecordExample example);

    int updateByExample(@Param("row") BroadcastTaskRecord row, @Param("example") BroadcastTaskRecordExample example);

    int updateByPrimaryKeySelective(BroadcastTaskRecord row);

    int updateByPrimaryKey(BroadcastTaskRecord row);
}