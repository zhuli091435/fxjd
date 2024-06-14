package com.fxjd.info.mapper;

import com.fxjd.info.pojo.WarnLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface WarnLogMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(WarnLog row);

    WarnLog selectByPrimaryKey(Integer ID);

    List<WarnLog> selectAll();

    int updateByPrimaryKey(WarnLog row);
}