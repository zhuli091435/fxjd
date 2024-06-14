package com.fxjd.info.mapper;

import com.fxjd.info.pojo.RoleNavigation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RoleNavigationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(RoleNavigation row);

    RoleNavigation selectByPrimaryKey(Integer ID);

    List<RoleNavigation> selectAll();

    int updateByPrimaryKey(RoleNavigation row);
}