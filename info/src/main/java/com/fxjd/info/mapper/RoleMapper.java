package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Role;
import com.fxjd.info.pojo.RoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(Role row);

    int insertSelective(Role row);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") Role row, @Param("example") RoleExample example);

    int updateByExample(@Param("row") Role row, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role row);

    int updateByPrimaryKey(Role row);
}