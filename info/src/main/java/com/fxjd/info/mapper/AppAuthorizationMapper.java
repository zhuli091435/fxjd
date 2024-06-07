package com.fxjd.info.mapper;

import com.fxjd.info.pojo.AppAuthorization;
import java.util.List;

public interface AppAuthorizationMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(AppAuthorization row);

    AppAuthorization selectByPrimaryKey(Integer ID);

    List<AppAuthorization> selectAll();

    int updateByPrimaryKey(AppAuthorization row);
}