package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ST_RAIN_R {
    private Integer ID;

    private String STCD;

    private Date TM;

    private String EQPNO;

    private BigDecimal rainIntensity;

    private Integer lightRainMode;

    private Integer moderateRainMode;

    private Integer heavyRainMode;

    private Integer rainstormMode;

    private BigDecimal waterPumpStatus1;

    private BigDecimal waterPumpStatus2;

    private BigDecimal waterPumpStatus3;

    private BigDecimal pipelineFlow1;

    private BigDecimal pipelineFlow2;

    private BigDecimal pipelineFlow3;

    private BigDecimal pipelinePressure1;

    private BigDecimal pipelinePressure2;

    private BigDecimal pipelinePressure3;

    private BigDecimal adjustingValveOpening1;

    private BigDecimal adjustingValveOpening2;

    private BigDecimal adjustingValveOpening3;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
    }

    public Date getTM() {
        return TM;
    }

    public void setTM(Date TM) {
        this.TM = TM;
    }

    public String getEQPNO() {
        return EQPNO;
    }

    public void setEQPNO(String EQPNO) {
        this.EQPNO = EQPNO == null ? null : EQPNO.trim();
    }

    public BigDecimal getRainIntensity() {
        return rainIntensity;
    }

    public void setRainIntensity(BigDecimal rainIntensity) {
        this.rainIntensity = rainIntensity;
    }

    public Integer getLightRainMode() {
        return lightRainMode;
    }

    public void setLightRainMode(Integer lightRainMode) {
        this.lightRainMode = lightRainMode;
    }

    public Integer getModerateRainMode() {
        return moderateRainMode;
    }

    public void setModerateRainMode(Integer moderateRainMode) {
        this.moderateRainMode = moderateRainMode;
    }

    public Integer getHeavyRainMode() {
        return heavyRainMode;
    }

    public void setHeavyRainMode(Integer heavyRainMode) {
        this.heavyRainMode = heavyRainMode;
    }

    public Integer getRainstormMode() {
        return rainstormMode;
    }

    public void setRainstormMode(Integer rainstormMode) {
        this.rainstormMode = rainstormMode;
    }

    public BigDecimal getWaterPumpStatus1() {
        return waterPumpStatus1;
    }

    public void setWaterPumpStatus1(BigDecimal waterPumpStatus1) {
        this.waterPumpStatus1 = waterPumpStatus1;
    }

    public BigDecimal getWaterPumpStatus2() {
        return waterPumpStatus2;
    }

    public void setWaterPumpStatus2(BigDecimal waterPumpStatus2) {
        this.waterPumpStatus2 = waterPumpStatus2;
    }

    public BigDecimal getWaterPumpStatus3() {
        return waterPumpStatus3;
    }

    public void setWaterPumpStatus3(BigDecimal waterPumpStatus3) {
        this.waterPumpStatus3 = waterPumpStatus3;
    }

    public BigDecimal getPipelineFlow1() {
        return pipelineFlow1;
    }

    public void setPipelineFlow1(BigDecimal pipelineFlow1) {
        this.pipelineFlow1 = pipelineFlow1;
    }

    public BigDecimal getPipelineFlow2() {
        return pipelineFlow2;
    }

    public void setPipelineFlow2(BigDecimal pipelineFlow2) {
        this.pipelineFlow2 = pipelineFlow2;
    }

    public BigDecimal getPipelineFlow3() {
        return pipelineFlow3;
    }

    public void setPipelineFlow3(BigDecimal pipelineFlow3) {
        this.pipelineFlow3 = pipelineFlow3;
    }

    public BigDecimal getPipelinePressure1() {
        return pipelinePressure1;
    }

    public void setPipelinePressure1(BigDecimal pipelinePressure1) {
        this.pipelinePressure1 = pipelinePressure1;
    }

    public BigDecimal getPipelinePressure2() {
        return pipelinePressure2;
    }

    public void setPipelinePressure2(BigDecimal pipelinePressure2) {
        this.pipelinePressure2 = pipelinePressure2;
    }

    public BigDecimal getPipelinePressure3() {
        return pipelinePressure3;
    }

    public void setPipelinePressure3(BigDecimal pipelinePressure3) {
        this.pipelinePressure3 = pipelinePressure3;
    }

    public BigDecimal getAdjustingValveOpening1() {
        return adjustingValveOpening1;
    }

    public void setAdjustingValveOpening1(BigDecimal adjustingValveOpening1) {
        this.adjustingValveOpening1 = adjustingValveOpening1;
    }

    public BigDecimal getAdjustingValveOpening2() {
        return adjustingValveOpening2;
    }

    public void setAdjustingValveOpening2(BigDecimal adjustingValveOpening2) {
        this.adjustingValveOpening2 = adjustingValveOpening2;
    }

    public BigDecimal getAdjustingValveOpening3() {
        return adjustingValveOpening3;
    }

    public void setAdjustingValveOpening3(BigDecimal adjustingValveOpening3) {
        this.adjustingValveOpening3 = adjustingValveOpening3;
    }
}