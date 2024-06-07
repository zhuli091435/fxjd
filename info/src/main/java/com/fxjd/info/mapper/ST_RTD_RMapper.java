package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_RTD_R;
import java.util.List;

public interface ST_RTD_RMapper {
    int insert(ST_RTD_R row);

    List<ST_RTD_R> selectAll();
}