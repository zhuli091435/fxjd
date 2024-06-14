package com.massiver.opcclient.mapper;

import com.massiver.opcclient.pojo.OPCItemInfo;
import java.util.List;

public interface OPCItemInfoMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(OPCItemInfo row);

    OPCItemInfo selectByPrimaryKey(Integer ID);

    List<OPCItemInfo> selectAll();

    int updateByPrimaryKey(OPCItemInfo row);
}