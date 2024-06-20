package com.massiver.opcclient.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class CtrlOrder {
    public final static String OPEN_GATE = "1065";
    public final static String CLOSE_GATE = "1066";
    public final static String STOP_GATE = "1067";
    private Integer ID;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    private String userID;

    private String stationID;

    private String orderCode;

    private BigDecimal orderParam;

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

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public BigDecimal getOrderParam() {
        return orderParam;
    }

    public void setOrderParam(BigDecimal orderParam) {
        this.orderParam = orderParam;
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