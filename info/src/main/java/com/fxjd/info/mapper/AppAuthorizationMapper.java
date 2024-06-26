package com.fxjd.info.mapper;

import com.fxjd.info.pojo.AppAuthorization;
import com.fxjd.info.pojo.AppAuthorizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppAuthorizationMapper {
    long countByExample(AppAuthorizationExample example);

    int deleteByExample(AppAuthorizationExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(AppAuthorization row);

    int insertSelective(AppAuthorization row);

    List<AppAuthorization> selectByExample(AppAuthorizationExample example);

    AppAuthorization selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") AppAuthorization row, @Param("example") AppAuthorizationExample example);

    int updateByExample(@Param("row") AppAuthorization row, @Param("example") AppAuthorizationExample example);

    int updateByPrimaryKeySelective(AppAuthorization row);

    int updateByPrimaryKey(AppAuthorization row);
}