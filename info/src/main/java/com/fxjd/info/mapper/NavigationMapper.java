package com.fxjd.info.mapper;

import com.fxjd.info.pojo.Navigation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NavigationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Navigation row);

    Navigation selectByPrimaryKey(Integer ID);

    List<Navigation> selectAll();

    int updateByPrimaryKey(Navigation row);
}