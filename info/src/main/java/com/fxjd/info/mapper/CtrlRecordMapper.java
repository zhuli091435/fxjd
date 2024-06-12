package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CtrlRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CtrlRecordMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(CtrlRecord row);

    CtrlRecord selectByPrimaryKey(Integer ID);

    List<CtrlRecord> selectAll();

    int updateByPrimaryKey(CtrlRecord row);
}