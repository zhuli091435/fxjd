package com.fxjd.info.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class ST_GATE_R {
    private Integer ID;

    private String STCD;

    private Date TM;

    private String EXKEY;

    private String EQPTP;

    private String EQPNO;

    private Short GTOPNUM;

    private BigDecimal GTOPHGT;

    private BigDecimal GTQ;

    private String MSQMT;

    private Integer runState;

    private BigDecimal ua;

    private BigDecimal ub;

    private BigDecimal uc;

    private BigDecimal ia;

    private BigDecimal ib;

    private BigDecimal ic;

    private BigDecimal activePower;

    private BigDecimal powerFactor;

    private String isRemote;

    private String fault;

    private String isControlEle;

    private String topState;

    private String bottomState;

    private String topMax;

    private String bottomMax;

    private String opUser;

    private String RUP;

    private String RDW;

    private String YUP;

    private String YDW;

    private String GUP;

    private String GDW;

    private Integer overload;

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

    public String getEXKEY() {
        return EXKEY;
    }

    public void setEXKEY(String EXKEY) {
        this.EXKEY = EXKEY == null ? null : EXKEY.trim();
    }

    public String getEQPTP() {
        return EQPTP;
    }

    public void setEQPTP(String EQPTP) {
        this.EQPTP = EQPTP == null ? null : EQPTP.trim();
    }

    public String getEQPNO() {
        return EQPNO;
    }

    public void setEQPNO(String EQPNO) {
        this.EQPNO = EQPNO == null ? null : EQPNO.trim();
    }

    public Short getGTOPNUM() {
        return GTOPNUM;
    }

    public void setGTOPNUM(Short GTOPNUM) {
        this.GTOPNUM = GTOPNUM;
    }

    public BigDecimal getGTOPHGT() {
        return GTOPHGT;
    }

    public void setGTOPHGT(BigDecimal GTOPHGT) {
        this.GTOPHGT = GTOPHGT;
    }

    public BigDecimal getGTQ() {
        return GTQ;
    }

    public void setGTQ(BigDecimal GTQ) {
        this.GTQ = GTQ;
    }

    public String getMSQMT() {
        return MSQMT;
    }

    public void setMSQMT(String MSQMT) {
        this.MSQMT = MSQMT == null ? null : MSQMT.trim();
    }

    public Integer getRunState() {
        return runState;
    }

    public void setRunState(Integer runState) {
        this.runState = runState;
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

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault == null ? null : fault.trim();
    }

    public String getIsControlEle() {
        return isControlEle;
    }

    public void setIsControlEle(String isControlEle) {
        this.isControlEle = isControlEle == null ? null : isControlEle.trim();
    }

    public String getTopState() {
        return topState;
    }

    public void setTopState(String topState) {
        this.topState = topState == null ? null : topState.trim();
    }

    public String getBottomState() {
        return bottomState;
    }

    public void setBottomState(String bottomState) {
        this.bottomState = bottomState == null ? null : bottomState.trim();
    }

    public String getTopMax() {
        return topMax;
    }

    public void setTopMax(String topMax) {
        this.topMax = topMax == null ? null : topMax.trim();
    }

    public String getBottomMax() {
        return bottomMax;
    }

    public void setBottomMax(String bottomMax) {
        this.bottomMax = bottomMax == null ? null : bottomMax.trim();
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser == null ? null : opUser.trim();
    }

    public String getRUP() {
        return RUP;
    }

    public void setRUP(String RUP) {
        this.RUP = RUP == null ? null : RUP.trim();
    }

    public String getRDW() {
        return RDW;
    }

    public void setRDW(String RDW) {
        this.RDW = RDW == null ? null : RDW.trim();
    }

    public String getYUP() {
        return YUP;
    }

    public void setYUP(String YUP) {
        this.YUP = YUP == null ? null : YUP.trim();
    }

    public String getYDW() {
        return YDW;
    }

    public void setYDW(String YDW) {
        this.YDW = YDW == null ? null : YDW.trim();
    }

    public String getGUP() {
        return GUP;
    }

    public void setGUP(String GUP) {
        this.GUP = GUP == null ? null : GUP.trim();
    }

    public String getGDW() {
        return GDW;
    }

    public void setGDW(String GDW) {
        this.GDW = GDW == null ? null : GDW.trim();
    }

    public Integer getOverload() {
        return overload;
    }

    public void setOverload(Integer overload) {
        this.overload = overload;
    }
}