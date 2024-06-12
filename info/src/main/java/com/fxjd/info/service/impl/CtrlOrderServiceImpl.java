package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.CtrlOrderMapper;
import com.fxjd.info.mapper.CtrlRecordMapper;
import com.fxjd.info.pojo.CtrlOrder;
import com.fxjd.info.service.CtrlOrderService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CtrlOrderServiceImpl implements CtrlOrderService {
    @Resource
    private CtrlOrderMapper ctrlOrderMapper;

    @Override
    public int add(CtrlOrder ctrlOrder) {
        return ctrlOrderMapper.insert(ctrlOrder);
    }
}
