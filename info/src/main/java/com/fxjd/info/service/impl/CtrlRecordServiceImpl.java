package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.CtrlRecordMapper;
import com.fxjd.info.pojo.CtrlRecord;
import com.fxjd.info.pojo.CtrlRecordExample;
import com.fxjd.info.service.CtrlRecordService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CtrlRecordServiceImpl implements CtrlRecordService {

    @Resource
    private CtrlRecordMapper ctrlRecordMapper;

    @Override
    public int add(CtrlRecord ctrlRecord) {
        return ctrlRecordMapper.insert(ctrlRecord);
    }

    @Override
    public List<CtrlRecord> getByStationIDAndDeviceID(String stationID, String deviceID, Integer operator, Date time) {

        CtrlRecordExample ctrlRecordExample = new CtrlRecordExample();
        ctrlRecordExample.createCriteria()
                .andStationIDEqualTo(stationID)
                .andDeviceIDEqualTo(deviceID)
                .andOperatorEqualTo(operator.toString())
                .andTimeGreaterThanOrEqualTo(time);
        return ctrlRecordMapper.selectByExample(ctrlRecordExample);
    }
}
