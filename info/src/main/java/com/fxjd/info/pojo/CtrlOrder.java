package com.fxjd.info.pojo;

import java.util.Date;

public class CtrlOrder {
    public final static String GATE_OPEN = "1060";//开闸
    public final static String GATE_CLOSE = "1061";//关闸
    public final static String GATE_STOP = "1062"; //停闸
    public final static String GATE_POSITION = "1063";//预设闸位
    public final static String GATE_MODE = "1064";//闸门操作模式
    public final static String PUMP_OPEN = "2060";//开泵
    public final static String PUMP_CLOSE = "2061";//关泵
    public final static String VALVE_OPEN = "3060";//开阀
    public final static String VALVE_CLOSE = "3061";//关阀
    public final static String WAVE_WORKMANSHIP = "4060";//造浪机工艺
    public final static String WAVE_COUNT = "4061";//造浪机设定循环次数
    public final static String WAVE_MANUAL = "4062";//造浪机手动模式
    public final static String WAVE_AUTO = "4063";//造浪机自动模式
    public final static String WAVE_OPEN = "4064";//造浪机启动
    public final static String WAVE_CLOSE = "4065";//造浪机停止
    public final static String WAVE_CRASH_CLOSE = "4066";//造浪机急停
    public final static String WAVE_RESET = "4067"; //造浪机故障复位
    public final static String RAIN_CTRL = "5060";//人工降雨

    private Integer ID;

    private Date time;

    private String userID;

    private String stationID;

    private String orderCode;

    private String orderParam;

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

    public String getOrderParam() {
        return orderParam;
    }

    public void setOrderParam(String orderParam) {
        this.orderParam = orderParam == null ? null : orderParam.trim();
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