package com.fxjd.info.mapper;

import com.fxjd.info.pojo.WarnLog;
import com.fxjd.info.pojo.WarnLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarnLogMapper {
    long countByExample(WarnLogExample example);

    int deleteByExample(WarnLogExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(WarnLog row);

    int insertSelective(WarnLog row);

    List<WarnLog> selectByExample(WarnLogExample example);

    WarnLog selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") WarnLog row, @Param("example") WarnLogExample example);

    int updateByExample(@Param("row") WarnLog row, @Param("example") WarnLogExample example);

    int updateByPrimaryKeySelective(WarnLog row);

    int updateByPrimaryKey(WarnLog row);
}