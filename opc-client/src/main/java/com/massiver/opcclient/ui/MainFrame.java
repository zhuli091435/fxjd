package com.massiver.opcclient.ui;

import com.massiver.opcclient.pojo.OPCItemInfo;
import com.massiver.opcclient.service.OPCItemInfoService;
import com.massiver.opcclient.service.impl.OPCItemInfoServiceImpl;

import java.util.List;

public class MainFrame {


    OPCItemInfoService opcItemInfoService = new OPCItemInfoServiceImpl();

    public MainFrame() {
        startGetData();
    }

    private void startGetData() {
        //初始化指令
        Thread startGetDataThread = new Thread(() -> {
            while (true) {
                try {
                    List<OPCItemInfo> opcItemInfoList = opcItemInfoService.getAll();

                } catch (Exception e) {

                }
            }
        });
        startGetDataThread.setDaemon(true);
        startGetDataThread.start();
    }
}
