package com.fxjd.info.mapper;

import com.fxjd.info.pojo.LoginRecord;
import java.util.List;

public interface LoginRecordMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(LoginRecord row);

    LoginRecord selectByPrimaryKey(Integer ID);

    List<LoginRecord> selectAll();

    int updateByPrimaryKey(LoginRecord row);
}