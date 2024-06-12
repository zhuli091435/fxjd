package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.CtrlRecordMapper;
import com.fxjd.info.pojo.CtrlRecord;
import com.fxjd.info.service.CtrlRecordService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CtrlRecordServiceImpl implements CtrlRecordService {

    @Resource
    private CtrlRecordMapper ctrlRecordMapper;

    @Override
    public int add(CtrlRecord ctrlRecord) {
        return ctrlRecordMapper.insert(ctrlRecord);
    }
}
