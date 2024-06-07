package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CtrlDetails;
import java.util.List;

public interface CtrlDetailsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(CtrlDetails row);

    CtrlDetails selectByPrimaryKey(Integer ID);

    List<CtrlDetails> selectAll();

    int updateByPrimaryKey(CtrlDetails row);
}