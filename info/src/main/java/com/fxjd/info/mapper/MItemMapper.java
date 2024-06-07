package com.fxjd.info.mapper;

import com.fxjd.info.pojo.MItem;
import java.util.List;

public interface MItemMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(MItem row);

    MItem selectByPrimaryKey(Integer ID);

    List<MItem> selectAll();

    int updateByPrimaryKey(MItem row);
}