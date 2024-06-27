package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_GATE_R;
import com.fxjd.info.pojo.ST_GATE_RExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ST_GATE_RMapper {
    long countByExample(ST_GATE_RExample example);

    int deleteByExample(ST_GATE_RExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ST_GATE_R row);

    int insertSelective(ST_GATE_R row);

    List<ST_GATE_R> selectByExample(ST_GATE_RExample example);

    ST_GATE_R selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") ST_GATE_R row, @Param("example") ST_GATE_RExample example);

    int updateByExample(@Param("row") ST_GATE_R row, @Param("example") ST_GATE_RExample example);

    int updateByPrimaryKeySelective(ST_GATE_R row);

    int updateByPrimaryKey(ST_GATE_R row);

    ST_GATE_R getLatestBySTCD(@Param("stcd") String stcd, @Param("eqpno") String eqpno);
}