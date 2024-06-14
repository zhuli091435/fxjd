package com.fxjd.info.pojo;

public class ST_RAIN_B {
    private String STCD;

    private String EQPNO;

    private String name;

    private String rainType;

    private String rainRemark;

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

    public String getRainType() {
        return rainType;
    }

    public void setRainType(String rainType) {
        this.rainType = rainType == null ? null : rainType.trim();
    }

    public String getRainRemark() {
        return rainRemark;
    }

    public void setRainRemark(String rainRemark) {
        this.rainRemark = rainRemark == null ? null : rainRemark.trim();
    }
}