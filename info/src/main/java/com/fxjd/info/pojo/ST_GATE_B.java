package com.fxjd.info.pojo;

public class ST_GATE_B {
    private String STCD;

    private String EQPNO;

    private String name;

    private String gateType;

    private String gateRemark;

    private Integer cameraID;

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
    }

    public String getEQPNO() {
        return EQPNO;
    }

    public void setEQPNO(String EQPNO) {
        this.EQPNO = EQPNO == null ? null : EQPNO.trim();
    }

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