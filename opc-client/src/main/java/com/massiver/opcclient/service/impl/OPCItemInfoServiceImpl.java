package com.massiver.opcclient.service.impl;

import com.massiver.opcclient.mapper.OPCItemInfoMapper;
import com.massiver.opcclient.pojo.OPCItemInfo;
import com.massiver.opcclient.pojo.OPCItemInfoExample;
import com.massiver.opcclient.service.OPCItemInfoService;
import com.massiver.opcclient.utils.SqlSessionUtil;

import java.math.BigDecimal;
import java.util.List;

public class OPCItemInfoServiceImpl implements OPCItemInfoService {

    @Override
    public List<OPCItemInfo> getAll() {
        OPCItemInfoMapper opcItemInfoMapper = SqlSessionUtil.openSession().getMapper(OPCItemInfoMapper.class);
        return opcItemInfoMapper.selectByExample(null);
    }

    @Override
    public List<OPCItemInfo> getByStationIDAndDeviceID(String stationID, String deviceID, String columnName) {
        OPCItemInfoMapper opcItemInfoMapper = SqlSessionUtil.openSession().getMapper(OPCItemInfoMapper.class);
        OPCItemInfoExample opcItemInfoExample = new OPCItemInfoExample();
        opcItemInfoExample.createCriteria().andStationIDEqualTo(stationID).andDeviceIDEqualTo(deviceID).andColumnNameEqualTo(columnName);
        return opcItemInfoMapper.selectByExample(opcItemInfoExample);
    }

    @Override
    public List<OPCItemInfo> getByDeviceName(String deviceName) {
        OPCItemInfoMapper opcItemInfoMapper = SqlSessionUtil.openSession().getMapper(OPCItemInfoMapper.class);
        OPCItemInfoExample opcItemInfoExample = new OPCItemInfoExample();
        opcItemInfoExample.createCriteria().andDeviceNameLike(deviceName);
        return opcItemInfoMapper.selectByExample(opcItemInfoExample);
    }
}
