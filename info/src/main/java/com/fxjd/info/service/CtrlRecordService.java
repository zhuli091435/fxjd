package com.fxjd.info.service;

import com.fxjd.info.pojo.CtrlRecord;

import java.util.Date;
import java.util.List;

public interface CtrlRecordService {
    int add(CtrlRecord ctrlRecord);

    List<CtrlRecord> getByStationIDAndDeviceID(String stcd, String deviceID, Integer operator, Date time);
}
