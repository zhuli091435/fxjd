package com.fxjd.info.mapper;

import com.fxjd.info.pojo.AlarmLine;
import java.util.List;

public interface AlarmLineMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(AlarmLine row);

    AlarmLine selectByPrimaryKey(Integer ID);

    List<AlarmLine> selectAll();

    int updateByPrimaryKey(AlarmLine row);
}