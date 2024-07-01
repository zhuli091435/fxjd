package com.fxjd.info.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class ST_WAS_R {
    private Integer ID;

    private String STCD;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("tm")
    private Date TM;

    private BigDecimal UPZ;

    private BigDecimal DWZ;

    private BigDecimal TGTZ;

    private String SWCHRCD;

    private String SUPWPTN;

    private String SDWWPTN;

    private String MSQMT;

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

    public BigDecimal getUPZ() {
        return UPZ;
    }

    public void setUPZ(BigDecimal UPZ) {
        this.UPZ = UPZ;
    }

    public BigDecimal getDWZ() {
        return DWZ;
    }

    public void setDWZ(BigDecimal DWZ) {
        this.DWZ = DWZ;
    }

    public BigDecimal getTGTZ() {
        return TGTZ;
    }

    public void setTGTZ(BigDecimal TGTZ) {
        this.TGTZ = TGTZ;
    }

    public String getSWCHRCD() {
        return SWCHRCD;
    }

    public void setSWCHRCD(String SWCHRCD) {
        this.SWCHRCD = SWCHRCD == null ? null : SWCHRCD.trim();
    }

    public String getSUPWPTN() {
        return SUPWPTN;
    }

    public void setSUPWPTN(String SUPWPTN) {
        this.SUPWPTN = SUPWPTN == null ? null : SUPWPTN.trim();
    }

    public String getSDWWPTN() {
        return SDWWPTN;
    }

    public void setSDWWPTN(String SDWWPTN) {
        this.SDWWPTN = SDWWPTN == null ? null : SDWWPTN.trim();
    }

    public String getMSQMT() {
        return MSQMT;
    }

    public void setMSQMT(String MSQMT) {
        this.MSQMT = MSQMT == null ? null : MSQMT.trim();
    }
}