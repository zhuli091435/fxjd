package com.fxjd.info.mapper;

import com.fxjd.info.pojo.BroadcastFile;
import com.fxjd.info.pojo.BroadcastFileExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BroadcastFileMapper {
    long countByExample(BroadcastFileExample example);

    int deleteByExample(BroadcastFileExample example);

    int deleteByPrimaryKey(Integer broadcastFileID);

    int insert(BroadcastFile row);

    int insertSelective(BroadcastFile row);

    List<BroadcastFile> selectByExample(BroadcastFileExample example);

    BroadcastFile selectByPrimaryKey(Integer broadcastFileID);

    int updateByExampleSelective(@Param("row") BroadcastFile row, @Param("example") BroadcastFileExample example);

    int updateByExample(@Param("row") BroadcastFile row, @Param("example") BroadcastFileExample example);

    int updateByPrimaryKeySelective(BroadcastFile row);

    int updateByPrimaryKey(BroadcastFile row);
}