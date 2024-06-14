package com.fxjd.info.mapper;

import com.fxjd.info.pojo.User_B;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface User_BMapper {
    int deleteByPrimaryKey(Integer userID);

    int insert(User_B row);

    User_B selectByPrimaryKey(Integer userID);

    List<User_B> selectAll();

    int updateByPrimaryKey(User_B row);
}