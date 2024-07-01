package com.fxjd.info.vo;

import com.fxjd.info.pojo.Broadcast;
import com.fxjd.info.service.BroadcastService;

public class BroadcastVO extends Broadcast {
    private Integer Status;

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }
}
