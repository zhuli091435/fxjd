package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CtrlOrder;
import com.fxjd.info.pojo.CtrlOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtrlOrderMapper {
    long countByExample(CtrlOrderExample example);

    int deleteByExample(CtrlOrderExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(CtrlOrder row);

    int insertSelective(CtrlOrder row);

    List<CtrlOrder> selectByExample(CtrlOrderExample example);

    CtrlOrder selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") CtrlOrder row, @Param("example") CtrlOrderExample example);

    int updateByExample(@Param("row") CtrlOrder row, @Param("example") CtrlOrderExample example);

    int updateByPrimaryKeySelective(CtrlOrder row);

    int updateByPrimaryKey(CtrlOrder row);
}