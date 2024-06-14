package com.fxjd.info.mapper;

import com.fxjd.info.pojo.LoginRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface LoginRecordMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(LoginRecord row);

    LoginRecord selectByPrimaryKey(Integer ID);

    List<LoginRecord> selectAll();

    int updateByPrimaryKey(LoginRecord row);
}