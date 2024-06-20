package com.massiver.opcclient.mapper;

import com.massiver.opcclient.pojo.OPCItemInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OPCItemInfoMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(OPCItemInfo row);

    OPCItemInfo selectByPrimaryKey(Integer ID);

    List<OPCItemInfo> selectAll();

    int updateByPrimaryKey(OPCItemInfo row);

    List<OPCItemInfo> selectByStationIDAndDeviceID(@Param("stationID") String stationID, @Param("deviceID") String deviceID, @Param("columnName") String columnName);
}