package com.fxjd.info.pojo;

public class ST_CABINET_B extends ST_CABINET_BKey {
    private String name;

    private String cabinetType;

    private String cabinetRemark;

    private Integer cameraID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCabinetType() {
        return cabinetType;
    }

    public void setCabinetType(String cabinetType) {
        this.cabinetType = cabinetType == null ? null : cabinetType.trim();
    }

    public String getCabinetRemark() {
        return cabinetRemark;
    }

    public void setCabinetRemark(String cabinetRemark) {
        this.cabinetRemark = cabinetRemark == null ? null : cabinetRemark.trim();
    }

    public Integer getCameraID() {
        return cameraID;
    }

    public void setCameraID(Integer cameraID) {
        this.cameraID = cameraID;
    }
}