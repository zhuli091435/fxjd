package com.fxjd.info.mapper;

import com.fxjd.info.pojo.DepartmentInfo_B;
import java.util.List;

public interface DepartmentInfo_BMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(DepartmentInfo_B row);

    DepartmentInfo_B selectByPrimaryKey(Integer ID);

    List<DepartmentInfo_B> selectAll();

    int updateByPrimaryKey(DepartmentInfo_B row);
}