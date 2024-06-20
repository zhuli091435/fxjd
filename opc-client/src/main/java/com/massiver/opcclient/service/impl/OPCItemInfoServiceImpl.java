package com.massiver.opcclient.service.impl;

import com.massiver.opcclient.mapper.OPCItemInfoMapper;
import com.massiver.opcclient.pojo.OPCItemInfo;
import com.massiver.opcclient.service.OPCItemInfoService;
import com.massiver.opcclient.utils.SqlSessionUtil;

import java.util.List;

public class OPCItemInfoServiceImpl implements OPCItemInfoService {

    @Override
    public List<OPCItemInfo> getAll() {
        OPCItemInfoMapper opcItemInfoMapper = SqlSessionUtil.openSession().getMapper(OPCItemInfoMapper.class);
        return opcItemInfoMapper.selectAll();
    }

    @Override
    public List<OPCItemInfo> getByStationIDAndDeviceID(String stationID, String deviceID, String columnName) {
        OPCItemInfoMapper opcItemInfoMapper = SqlSessionUtil.openSession().getMapper(OPCItemInfoMapper.class);
        return opcItemInfoMapper.selectByStationIDAndDeviceID(stationID, deviceID, columnName);
    }
}
