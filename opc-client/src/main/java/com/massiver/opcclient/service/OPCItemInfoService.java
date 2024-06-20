package com.massiver.opcclient.service;

import com.massiver.opcclient.pojo.OPCItemInfo;

import java.util.List;

public interface OPCItemInfoService {
    List<OPCItemInfo> getAll();

    List<OPCItemInfo> getByStationIDAndDeviceID(String stationID, String deviceID, String columnName);
}
