package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CtrlOrder;
import java.util.List;

public interface CtrlOrderMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(CtrlOrder row);

    CtrlOrder selectByPrimaryKey(Integer ID);

    List<CtrlOrder> selectAll();

    int updateByPrimaryKey(CtrlOrder row);
}