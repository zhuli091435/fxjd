package com.fxjd.info.mapper;

import com.fxjd.info.pojo.CtrlDetails;
import com.fxjd.info.pojo.CtrlDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CtrlDetailsMapper {
    long countByExample(CtrlDetailsExample example);

    int deleteByExample(CtrlDetailsExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(CtrlDetails row);

    int insertSelective(CtrlDetails row);

    List<CtrlDetails> selectByExample(CtrlDetailsExample example);

    CtrlDetails selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") CtrlDetails row, @Param("example") CtrlDetailsExample example);

    int updateByExample(@Param("row") CtrlDetails row, @Param("example") CtrlDetailsExample example);

    int updateByPrimaryKeySelective(CtrlDetails row);

    int updateByPrimaryKey(CtrlDetails row);
}