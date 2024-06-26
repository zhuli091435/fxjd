package com.fxjd.info.mapper;

import com.fxjd.info.pojo.LoginRecord;
import com.fxjd.info.pojo.LoginRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginRecordMapper {
    long countByExample(LoginRecordExample example);

    int deleteByExample(LoginRecordExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(LoginRecord row);

    int insertSelective(LoginRecord row);

    List<LoginRecord> selectByExample(LoginRecordExample example);

    LoginRecord selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") LoginRecord row, @Param("example") LoginRecordExample example);

    int updateByExample(@Param("row") LoginRecord row, @Param("example") LoginRecordExample example);

    int updateByPrimaryKeySelective(LoginRecord row);

    int updateByPrimaryKey(LoginRecord row);
}