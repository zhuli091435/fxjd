package com.fxjd.info.mapper;

import com.fxjd.info.pojo.DepartmentInfo_B;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DepartmentInfo_BMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(DepartmentInfo_B row);

    DepartmentInfo_B selectByPrimaryKey(Integer ID);

    List<DepartmentInfo_B> selectAll();

    int updateByPrimaryKey(DepartmentInfo_B row);
}