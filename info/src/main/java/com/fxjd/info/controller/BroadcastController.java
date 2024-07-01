package com.fxjd.info.controller;

import com.fxjd.info.pojo.Broadcast;
import com.fxjd.info.pojo.CameraEquipment;
import com.fxjd.info.service.BroadcastService;
import com.fxjd.info.service.CameraEquipmentService;
import com.fxjd.info.utils.IPUtils;
import com.fxjd.info.vo.BroadcastVO;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BroadcastController extends ParentController {
    @Resource
    private BroadcastService broadcastService;

    @RequestMapping("/broadcast")
    public List<Broadcast> getBroadcast() {
        return broadcastService.getAll();
    }

    @RequestMapping("/broadcast/status")
    public List<BroadcastVO> getBroadcastStatus() {

        List<BroadcastVO> broadcastVOList = new ArrayList<>();
        List<Broadcast> broadcastList = broadcastService.getAll();
        for (Broadcast broadcast : broadcastList) {
            BroadcastVO broadcastVO = new BroadcastVO();
            BeanUtils.copyProperties(broadcast, broadcastVO);
            //broadcastVO.setStatus(IPUtils.isReachable(broadcast.getBroadcastEndpoint()) ? 1 : 0);
            broadcastVO.setStatus(1);
            broadcastVOList.add(broadcastVO);
        }
        return broadcastVOList;
    }
}
