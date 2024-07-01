package com.fxjd.info.vo;

public class StatVO {
    private Integer online;
    private Integer offline;

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Integer getOffline() {
        return offline;
    }

    public void setOffline(Integer offline) {
        this.offline = offline;
    }

    public StatVO(Integer online, Integer offline) {
        this.online = online;
        this.offline = offline;
    }
}
