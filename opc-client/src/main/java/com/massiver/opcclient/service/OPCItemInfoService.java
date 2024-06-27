package com.massiver.opcclient.service;

import com.massiver.opcclient.pojo.OPCItemInfo;

import java.math.BigDecimal;
import java.util.List;

public interface OPCItemInfoService {
    List<OPCItemInfo> getAll();

    List<OPCItemInfo> getByStationIDAndDeviceID(String stationID, String deviceID, String columnName);

    List<OPCItemInfo> getByDeviceName(String deviceName);
}
