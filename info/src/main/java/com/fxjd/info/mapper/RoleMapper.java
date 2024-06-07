package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Role row);

    Role selectByPrimaryKey(Integer ID);

    List<Role> selectAll();

    int updateByPrimaryKey(Role row);
}