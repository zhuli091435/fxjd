package com.fxjd.info.mapper;

import com.fxjd.info.pojo.MItem;
import com.fxjd.info.pojo.MItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MItemMapper {
    long countByExample(MItemExample example);

    int deleteByExample(MItemExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(MItem row);

    int insertSelective(MItem row);

    List<MItem> selectByExample(MItemExample example);

    MItem selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") MItem row, @Param("example") MItemExample example);

    int updateByExample(@Param("row") MItem row, @Param("example") MItemExample example);

    int updateByPrimaryKeySelective(MItem row);

    int updateByPrimaryKey(MItem row);
}