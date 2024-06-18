package com.massiver.opcclient.service.impl;

import com.massiver.opcclient.mapper.DynamicMapper;
import com.massiver.opcclient.mapper.OPCItemInfoMapper;
import com.massiver.opcclient.service.DynamicService;
import com.massiver.opcclient.utils.SqlSessionUtil;

public class DynamicServiceImpl implements DynamicService {

    @Override
    public int executeSQL(String sql) {
        DynamicMapper dynamicMapper = SqlSessionUtil.openSession().getMapper(DynamicMapper.class);
        int res = dynamicMapper.executeSQL(sql);
        SqlSessionUtil.openSession().commit();
        return res;
    }
}
