package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ST_PUMP_R {
    private Integer ID;

    private String STCD;

    private Date TM;

    private String EQPNO;

    private String FALUT;

    private Integer STATUS;

    private String AUTO;

    private BigDecimal ua;

    private BigDecimal ub;

    private BigDecimal uc;

    private BigDecimal uab;

    private BigDecimal ubc;

    private BigDecimal uca;

    private BigDecimal ia;

    private BigDecimal ib;

    private BigDecimal ic;

    private BigDecimal activePower;

    private BigDecimal reactivePower;

    private BigDecimal powerFactor;

    private String isRemote;

    private String isControlEle;

    private String opUser;

    private BigDecimal flow;

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

    public String getFALUT() {
        return FALUT;
    }

    public void setFALUT(String FALUT) {
        this.FALUT = FALUT == null ? null : FALUT.trim();
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public String getAUTO() {
        return AUTO;
    }

    public void setAUTO(String AUTO) {
        this.AUTO = AUTO == null ? null : AUTO.trim();
    }

    public BigDecimal getUa() {
        return ua;
    }

    public void setUa(BigDecimal ua) {
        this.ua = ua;
    }

    public BigDecimal getUb() {
        return ub;
    }

    public void setUb(BigDecimal ub) {
        this.ub = ub;
    }

    public BigDecimal getUc() {
        return uc;
    }

    public void setUc(BigDecimal uc) {
        this.uc = uc;
    }

    public BigDecimal getUab() {
        return uab;
    }

    public void setUab(BigDecimal uab) {
        this.uab = uab;
    }

    public BigDecimal getUbc() {
        return ubc;
    }

    public void setUbc(BigDecimal ubc) {
        this.ubc = ubc;
    }

    public BigDecimal getUca() {
        return uca;
    }

    public void setUca(BigDecimal uca) {
        this.uca = uca;
    }

    public BigDecimal getIa() {
        return ia;
    }

    public void setIa(BigDecimal ia) {
        this.ia = ia;
    }

    public BigDecimal getIb() {
        return ib;
    }

    public void setIb(BigDecimal ib) {
        this.ib = ib;
    }

    public BigDecimal getIc() {
        return ic;
    }

    public void setIc(BigDecimal ic) {
        this.ic = ic;
    }

    public BigDecimal getActivePower() {
        return activePower;
    }

    public void setActivePower(BigDecimal activePower) {
        this.activePower = activePower;
    }

    public BigDecimal getReactivePower() {
        return reactivePower;
    }

    public void setReactivePower(BigDecimal reactivePower) {
        this.reactivePower = reactivePower;
    }

    public BigDecimal getPowerFactor() {
        return powerFactor;
    }

    public void setPowerFactor(BigDecimal powerFactor) {
        this.powerFactor = powerFactor;
    }

    public String getIsRemote() {
        return isRemote;
    }

    public void setIsRemote(String isRemote) {
        this.isRemote = isRemote == null ? null : isRemote.trim();
    }

    public String getIsControlEle() {
        return isControlEle;
    }

    public void setIsControlEle(String isControlEle) {
        this.isControlEle = isControlEle == null ? null : isControlEle.trim();
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser == null ? null : opUser.trim();
    }

    public BigDecimal getFlow() {
        return flow;
    }

    public void setFlow(BigDecimal flow) {
        this.flow = flow;
    }
}