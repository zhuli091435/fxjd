package com.fxjd.info.pojo;

public class BroadcastTaskTemplete {
    private Integer templeteID;

    private String taskName;

    private String method;

    private String state;

    private String text;

    private String broadcastFileIDs;

    private String broadcastEndpoints;

    private Integer play_mode;

    private Integer play_volume;

    private Integer play_second;

    private String remark;

    public Integer getTempleteID() {
        return templeteID;
    }

    public void setTempleteID(Integer templeteID) {
        this.templeteID = templeteID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}