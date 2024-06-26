package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_PPTN_R;
import com.fxjd.info.pojo.ST_PPTN_RExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ST_PPTN_RMapper {
    long countByExample(ST_PPTN_RExample example);

    int deleteByExample(ST_PPTN_RExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ST_PPTN_R row);

    int insertSelective(ST_PPTN_R row);

    List<ST_PPTN_R> selectByExample(ST_PPTN_RExample example);

    ST_PPTN_R selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") ST_PPTN_R row, @Param("example") ST_PPTN_RExample example);

    int updateByExample(@Param("row") ST_PPTN_R row, @Param("example") ST_PPTN_RExample example);

    int updateByPrimaryKeySelective(ST_PPTN_R row);

    int updateByPrimaryKey(ST_PPTN_R row);
}