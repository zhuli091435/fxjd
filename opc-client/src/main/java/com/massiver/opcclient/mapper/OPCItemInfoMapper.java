package com.massiver.opcclient.mapper;

import com.massiver.opcclient.pojo.OPCItemInfo;
import com.massiver.opcclient.pojo.OPCItemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OPCItemInfoMapper {
    long countByExample(OPCItemInfoExample example);

    int deleteByExample(OPCItemInfoExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(OPCItemInfo row);

    int insertSelective(OPCItemInfo row);

    List<OPCItemInfo> selectByExample(OPCItemInfoExample example);

    OPCItemInfo selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("row") OPCItemInfo row, @Param("example") OPCItemInfoExample example);

    int updateByExample(@Param("row") OPCItemInfo row, @Param("example") OPCItemInfoExample example);

    int updateByPrimaryKeySelective(OPCItemInfo row);

    int updateByPrimaryKey(OPCItemInfo row);
}