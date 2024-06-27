package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ST_Flow_R {
    private Integer ID;

    private String STCD;

    private Date TM;

    private String EQPNO;

    private BigDecimal pipelineFlow;

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

    public BigDecimal getPipelineFlow() {
        return pipelineFlow;
    }

    public void setPipelineFlow(BigDecimal pipelineFlow) {
        this.pipelineFlow = pipelineFlow;
    }
}