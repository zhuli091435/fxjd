package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Navigation;
import com.fxjd.info.pojo.NavigationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NavigationMapper {
    long countByExample(NavigationExample example);

    int deleteByExample(NavigationExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(Navigation row);

    int insertSelective(Navigation row);

    List<Navigation> selectByExample(NavigationExample example);

    Navigation selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") Navigation row, @Param("example") NavigationExample example);

    int updateByExample(@Param("row") Navigation row, @Param("example") NavigationExample example);

    int updateByPrimaryKeySelective(Navigation row);

    int updateByPrimaryKey(Navigation row);
}