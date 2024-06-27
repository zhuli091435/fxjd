package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ST_CABINET_R {
    private Integer ID;

    private String STCD;

    private Date TM;

    private String EQPNO;

    private BigDecimal uab;

    private BigDecimal ubc;

    private BigDecimal uca;

    private BigDecimal ia;

    private BigDecimal ib;

    private BigDecimal ic;

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
}