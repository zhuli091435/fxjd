package com.fxjd.info.pojo;

import java.util.Date;

public class CtrlOrder {
    private Integer ID;

    private Date time;

    private String userID;

    private String stationID;

    private String state;

    private String deviceID;

    private Integer ctrlRecordID;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID == null ? null : stationID.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID == null ? null : deviceID.trim();
    }

    public Integer getCtrlRecordID() {
        return ctrlRecordID;
    }

    public void setCtrlRecordID(Integer ctrlRecordID) {
        this.ctrlRecordID = ctrlRecordID;
    }
}