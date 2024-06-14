package com.fxjd.info.mapper;

import com.fxjd.info.pojo.AlarmLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlarmLineMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(AlarmLine row);

    AlarmLine selectByPrimaryKey(Integer ID);

    List<AlarmLine> selectAll();

    int updateByPrimaryKey(AlarmLine row);
}