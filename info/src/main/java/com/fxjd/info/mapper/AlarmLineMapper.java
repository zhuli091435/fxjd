package com.fxjd.info.mapper;

import com.fxjd.info.pojo.AlarmLine;
import com.fxjd.info.pojo.AlarmLineExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AlarmLineMapper {
    long countByExample(AlarmLineExample example);

    int deleteByExample(AlarmLineExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(AlarmLine row);

    int insertSelective(AlarmLine row);

    List<AlarmLine> selectByExample(AlarmLineExample example);

    AlarmLine selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") AlarmLine row, @Param("example") AlarmLineExample example);

    int updateByExample(@Param("row") AlarmLine row, @Param("example") AlarmLineExample example);

    int updateByPrimaryKeySelective(AlarmLine row);

    int updateByPrimaryKey(AlarmLine row);
}