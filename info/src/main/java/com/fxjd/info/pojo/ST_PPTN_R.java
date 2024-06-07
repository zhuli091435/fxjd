package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ST_PPTN_R {
    private Integer ID;

    private String STCD;

    private Date TM;

    private BigDecimal DRP;

    private BigDecimal INTV;

    private BigDecimal PDR;

    private BigDecimal DYP;

    private String WTH;

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

    public BigDecimal getDRP() {
        return DRP;
    }

    public void setDRP(BigDecimal DRP) {
        this.DRP = DRP;
    }

    public BigDecimal getINTV() {
        return INTV;
    }

    public void setINTV(BigDecimal INTV) {
        this.INTV = INTV;
    }

    public BigDecimal getPDR() {
        return PDR;
    }

    public void setPDR(BigDecimal PDR) {
        this.PDR = PDR;
    }

    public BigDecimal getDYP() {
        return DYP;
    }

    public void setDYP(BigDecimal DYP) {
        this.DYP = DYP;
    }

    public String getWTH() {
        return WTH;
    }

    public void setWTH(String WTH) {
        this.WTH = WTH == null ? null : WTH.trim();
    }
}