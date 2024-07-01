package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.BroadcastMapper;
import com.fxjd.info.mapper.CameraEquipmentMapper;
import com.fxjd.info.pojo.Broadcast;
import com.fxjd.info.service.BroadcastService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BroadcastServiceImpl implements BroadcastService {
    @Resource
    private BroadcastMapper broadcastMapper;

    @Override
    public List<Broadcast> getAll() {
        return broadcastMapper.selectByExample(null);
    }
}
