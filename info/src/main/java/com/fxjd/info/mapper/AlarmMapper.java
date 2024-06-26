package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Alarm;
import com.fxjd.info.pojo.AlarmExample;
import com.fxjd.info.pojo.AlarmKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmMapper {
    long countByExample(AlarmExample example);

    int deleteByExample(AlarmExample example);

    int deleteByPrimaryKey(AlarmKey key);

    int insert(Alarm row);

    int insertSelective(Alarm row);

    List<Alarm> selectByExample(AlarmExample example);

    Alarm selectByPrimaryKey(AlarmKey key);

    int updateByExampleSelective(@Param("row") Alarm row, @Param("example") AlarmExample example);

    int updateByExample(@Param("row") Alarm row, @Param("example") AlarmExample example);

    int updateByPrimaryKeySelective(Alarm row);

    int updateByPrimaryKey(Alarm row);
}