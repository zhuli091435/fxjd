package com.fxjd.info.mapper;

import com.fxjd.info.pojo.WarnLog;
import java.util.List;

public interface WarnLogMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(WarnLog row);

    WarnLog selectByPrimaryKey(Integer ID);

    List<WarnLog> selectAll();

    int updateByPrimaryKey(WarnLog row);
}