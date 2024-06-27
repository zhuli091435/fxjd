package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ST_Valve_R {
    private Integer ID;

    private String STCD;

    private Date TM;

    private String EQPNO;

    private BigDecimal valveOpening;

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

    public BigDecimal getValveOpening() {
        return valveOpening;
    }

    public void setValveOpening(BigDecimal valveOpening) {
        this.valveOpening = valveOpening;
    }
}