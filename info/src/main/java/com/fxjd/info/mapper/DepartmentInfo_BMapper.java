package com.fxjd.info.mapper;

import com.fxjd.info.pojo.DepartmentInfo_B;
import com.fxjd.info.pojo.DepartmentInfo_BExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DepartmentInfo_BMapper {
    long countByExample(DepartmentInfo_BExample example);

    int deleteByExample(DepartmentInfo_BExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(DepartmentInfo_B row);

    int insertSelective(DepartmentInfo_B row);

    List<DepartmentInfo_B> selectByExample(DepartmentInfo_BExample example);

    DepartmentInfo_B selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") DepartmentInfo_B row, @Param("example") DepartmentInfo_BExample example);

    int updateByExample(@Param("row") DepartmentInfo_B row, @Param("example") DepartmentInfo_BExample example);

    int updateByPrimaryKeySelective(DepartmentInfo_B row);

    int updateByPrimaryKey(DepartmentInfo_B row);
}