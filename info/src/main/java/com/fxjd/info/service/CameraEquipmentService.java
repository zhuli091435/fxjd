package com.fxjd.info.service;

import com.fxjd.info.pojo.CameraEquipment;

import java.util.List;

public interface CameraEquipmentService {
    List<CameraEquipment> getCameraEquipmentByStationID(String stcd);
}
