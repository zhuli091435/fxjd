package com.fxjd.info.pojo;

public class ST_H_GATE_B extends ST_H_GATE_BKey {
    private String name;

    private String gateType;

    private String gateRemark;

    private Integer cameraID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGateType() {
        return gateType;
    }

    public void setGateType(String gateType) {
        this.gateType = gateType == null ? null : gateType.trim();
    }

    public String getGateRemark() {
        return gateRemark;
    }

    public void setGateRemark(String gateRemark) {
        this.gateRemark = gateRemark == null ? null : gateRemark.trim();
    }

    public Integer getCameraID() {
        return cameraID;
    }

    public void setCameraID(Integer cameraID) {
        this.cameraID = cameraID;
    }
}