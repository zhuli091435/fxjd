package com.fxjd.info.mapper;

import com.fxjd.info.pojo.User_B;
import com.fxjd.info.pojo.User_BExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_BMapper {
    long countByExample(User_BExample example);

    int deleteByExample(User_BExample example);

    int deleteByPrimaryKey(Integer userID);

    int insert(User_B row);

    int insertSelective(User_B row);

    List<User_B> selectByExample(User_BExample example);

    User_B selectByPrimaryKey(Integer userID);

    int updateByExampleSelective(@Param("row") User_B row, @Param("example") User_BExample example);

    int updateByExample(@Param("row") User_B row, @Param("example") User_BExample example);

    int updateByPrimaryKeySelective(User_B row);

    int updateByPrimaryKey(User_B row);
}