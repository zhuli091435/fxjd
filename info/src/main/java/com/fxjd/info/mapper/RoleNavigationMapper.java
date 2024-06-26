package com.fxjd.info.mapper;

import com.fxjd.info.pojo.RoleNavigation;
import com.fxjd.info.pojo.RoleNavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleNavigationMapper {
    long countByExample(RoleNavigationExample example);

    int deleteByExample(RoleNavigationExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(RoleNavigation row);

    int insertSelective(RoleNavigation row);

    List<RoleNavigation> selectByExample(RoleNavigationExample example);

    RoleNavigation selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") RoleNavigation row, @Param("example") RoleNavigationExample example);

    int updateByExample(@Param("row") RoleNavigation row, @Param("example") RoleNavigationExample example);

    int updateByPrimaryKeySelective(RoleNavigation row);

    int updateByPrimaryKey(RoleNavigation row);
}