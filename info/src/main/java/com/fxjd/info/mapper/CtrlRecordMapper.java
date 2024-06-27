package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CtrlRecord;
import com.fxjd.info.pojo.CtrlRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CtrlRecordMapper {
    long countByExample(CtrlRecordExample example);

    int deleteByExample(CtrlRecordExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(CtrlRecord row);

    int insertSelective(CtrlRecord row);

    List<CtrlRecord> selectByExample(CtrlRecordExample example);

    CtrlRecord selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") CtrlRecord row, @Param("example") CtrlRecordExample example);

    int updateByExample(@Param("row") CtrlRecord row, @Param("example") CtrlRecordExample example);

    int updateByPrimaryKeySelective(CtrlRecord row);

    int updateByPrimaryKey(CtrlRecord row);
}