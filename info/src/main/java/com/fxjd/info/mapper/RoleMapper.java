package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Role row);

    Role selectByPrimaryKey(Integer ID);

    List<Role> selectAll();

    int updateByPrimaryKey(Role row);
}