package com.fxjd.info.pojo;

public class ST_Valve_B extends ST_Valve_BKey {
    private String name;

    private String valveType;

    private String valveRemark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValveType() {
        return valveType;
    }

    public void setValveType(String valveType) {
        this.valveType = valveType == null ? null : valveType.trim();
    }

    public String getValveRemark() {
        return valveRemark;
    }

    public void setValveRemark(String valveRemark) {
        this.valveRemark = valveRemark == null ? null : valveRemark.trim();
    }
}