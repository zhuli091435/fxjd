package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.CameraEquipmentMapper;
import com.fxjd.info.mapper.CtrlDetailsMapper;
import com.fxjd.info.pojo.CameraEquipment;
import com.fxjd.info.pojo.CameraEquipmentExample;
import com.fxjd.info.service.CameraEquipmentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CameraEquipmentServiceImpl implements CameraEquipmentService {
    @Resource
    private CameraEquipmentMapper cameraEquipmentMapper;

    @Override
    public List<CameraEquipment> getCameraEquipmentByStationID(String stcd) {
        CameraEquipmentExample cameraEquipmentExample = new CameraEquipmentExample();
        cameraEquipmentExample.createCriteria().andStationIDEqualTo(stcd);
        return cameraEquipmentMapper.selectByExample(cameraEquipmentExample);
    }
}
