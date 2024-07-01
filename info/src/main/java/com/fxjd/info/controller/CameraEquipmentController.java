package com.fxjd.info.controller;

import com.fxjd.info.pojo.CameraEquipment;
import com.fxjd.info.pojo.CtrlDetails;
import com.fxjd.info.pojo.ST_Valve_B;
import com.fxjd.info.pojo.ST_Valve_R;
import com.fxjd.info.service.CameraEquipmentService;
import com.fxjd.info.service.CtrlDetailsService;
import com.fxjd.info.vo.StatVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;

@RestController
public class CameraEquipmentController extends ParentController {
    @Resource
    private CameraEquipmentService cameraEquipmentService;

    @RequestMapping("/getCamera")
    public List<CameraEquipment> getCameraEquipment(String stcd) {
        return cameraEquipmentService.getCameraEquipmentByStationID(stcd);
    }

    @RequestMapping("/camera/stat")
    public StatVO getGateStatData(String stcd) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.HOUR, -2);
        StatVO statVO = new StatVO(0, 0);

        List<CameraEquipment> cameraEquipmentList = cameraEquipmentService.getCameraEquipmentByStationID(stcd);
        for (CameraEquipment cameraEquipment : cameraEquipmentList) {
            statVO.setOnline(statVO.getOnline() + 1);
        }
        return statVO;
    }
}
