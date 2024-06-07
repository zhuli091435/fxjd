package com.fxjd.info.pojo;

import java.util.Date;

public class BroadcastTaskRecord {
    private Integer taskRecordID;

    private String taskName;

    private Date createTime;

    private Integer userID;

    private String method;

    private Date playTime;

    private String state;

    private String text;

    private String broadcastFileIDs;

    private String broadcastEndpoints;

    private String hashKey;

    private Integer play_mode;

    private Integer play_volume;

    private Integer play_second;

    public Integer getTaskRecordID() {
        return taskRecordID;
    }

    public void setTaskRecordID(Integer taskRecordID) {
        this.taskRecordID = taskRecordID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getBroadcastFileIDs() {
        return broadcastFileIDs;
    }

    public void setBroadcastFileIDs(String broadcastFileIDs) {
        this.broadcastFileIDs = broadcastFileIDs == null ? null : broadcastFileIDs.trim();
    }

    public String getBroadcastEndpoints() {
        return broadcastEndpoints;
    }

    public void setBroadcastEndpoints(String broadcastEndpoints) {
        this.broadcastEndpoints = broadcastEndpoints == null ? null : broadcastEndpoints.trim();
    }

    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey == null ? null : hashKey.trim();
    }

    public Integer getPlay_mode() {
        return play_mode;
    }

    public void setPlay_mode(Integer play_mode) {
        this.play_mode = play_mode;
    }

    public Integer getPlay_volume() {
        return play_volume;
    }

    public void setPlay_volume(Integer play_volume) {
        this.play_volume = play_volume;
    }

    public Integer getPlay_second() {
        return play_second;
    }

    public void setPlay_second(Integer play_second) {
        this.play_second = play_second;
    }
}