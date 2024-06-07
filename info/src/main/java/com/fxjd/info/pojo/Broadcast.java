package com.fxjd.info.pojo;

public class Broadcast {
    private Integer broadcastID;

    private String broadcastEndpoint;

    private String broadcastName;

    public Integer getBroadcastID() {
        return broadcastID;
    }

    public void setBroadcastID(Integer broadcastID) {
        this.broadcastID = broadcastID;
    }

    public String getBroadcastEndpoint() {
        return broadcastEndpoint;
    }

    public void setBroadcastEndpoint(String broadcastEndpoint) {
        this.broadcastEndpoint = broadcastEndpoint == null ? null : broadcastEndpoint.trim();
    }

    public String getBroadcastName() {
        return broadcastName;
    }

    public void setBroadcastName(String broadcastName) {
        this.broadcastName = broadcastName == null ? null : broadcastName.trim();
    }
}