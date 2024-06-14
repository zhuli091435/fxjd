package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CtrlDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CtrlDetailsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(CtrlDetails row);

    CtrlDetails selectByPrimaryKey(Integer ID);

    List<CtrlDetails> selectAll();

    int updateByPrimaryKey(CtrlDetails row);

    List<CtrlDetails> selectByCtrlRecordID(Integer ctrlRecordID);
}