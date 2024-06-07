package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_GATE_B;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ST_GATE_BMapper {
    int deleteByPrimaryKey(@Param("STCD") String STCD, @Param("EQPNO") String EQPNO);

    int insert(ST_GATE_B row);

    ST_GATE_B selectByPrimaryKey(@Param("STCD") String STCD, @Param("EQPNO") String EQPNO);

    List<ST_GATE_B> selectAll();

    int updateByPrimaryKey(ST_GATE_B row);
}