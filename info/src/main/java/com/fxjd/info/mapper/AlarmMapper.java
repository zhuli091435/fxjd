package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Alarm;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AlarmMapper {
    int deleteByPrimaryKey(@Param("STCD") String STCD, @Param("itemID") String itemID);

    int insert(Alarm row);

    Alarm selectByPrimaryKey(@Param("STCD") String STCD, @Param("itemID") String itemID);

    List<Alarm> selectAll();

    int updateByPrimaryKey(Alarm row);
}