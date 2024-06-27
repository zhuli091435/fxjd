package com.fxjd.info.pojo;

public class ST_Flow_B extends ST_Flow_BKey {
    private String name;

    private String flowType;

    private String flowRemark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }

    public String getFlowRemark() {
        return flowRemark;
    }

    public void setFlowRemark(String flowRemark) {
        this.flowRemark = flowRemark == null ? null : flowRemark.trim();
    }
}