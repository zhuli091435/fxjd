package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CtrlOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CtrlOrderMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(CtrlOrder row);

    CtrlOrder selectByPrimaryKey(Integer ID);

    List<CtrlOrder> selectAll();

    int updateByPrimaryKey(CtrlOrder row);
}