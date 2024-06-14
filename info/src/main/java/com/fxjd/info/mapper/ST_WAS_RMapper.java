package com.fxjd.info.mapper;

import com.fxjd.info.pojo.ST_WAS_R;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ST_WAS_RMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(ST_WAS_R row);

    ST_WAS_R selectByPrimaryKey(Integer ID);

    List<ST_WAS_R> selectAll();

    int updateByPrimaryKey(ST_WAS_R row);

    ST_WAS_R selectLatestBySTCD(String stcd);
}