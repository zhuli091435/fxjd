package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ST_H_GATE_R {
    private Integer ID;

    private String STCD;

    private Date TM;

    private String EQPNO;

    private Integer remoteStatus;

    private Integer mainPumpFault;

    private Integer backupPumpFault;

    private Integer mainPumpRun;

    private Integer backupPumpRun;

    private Integer fault;

    private Integer fullOpen;

    private Integer fullClose;

    private Integer chuanXiao;

    private Integer tuoXiao;

    private Integer leftOpenValve;

    private Integer leftCloseValve;

    private Integer rightOpenValve;

    private Integer rightCloseValve;

    private Integer leftChuanXiaoValve;

    private Integer leftTuoXiaoValve;

    private Integer rightChuanXiaoValve;

    private Integer rightTuoXiaoValve;

    private BigDecimal leftOpening;

    private BigDecimal rightOpening;

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

    public Integer getRemoteStatus() {
        return remoteStatus;
    }

    public void setRemoteStatus(Integer remoteStatus) {
        this.remoteStatus = remoteStatus;
    }

    public Integer getMainPumpFault() {
        return mainPumpFault;
    }

    public void setMainPumpFault(Integer mainPumpFault) {
        this.mainPumpFault = mainPumpFault;
    }

    public Integer getBackupPumpFault() {
        return backupPumpFault;
    }

    public void setBackupPumpFault(Integer backupPumpFault) {
        this.backupPumpFault = backupPumpFault;
    }

    public Integer getMainPumpRun() {
        return mainPumpRun;
    }

    public void setMainPumpRun(Integer mainPumpRun) {
        this.mainPumpRun = mainPumpRun;
    }

    public Integer getBackupPumpRun() {
        return backupPumpRun;
    }

    public void setBackupPumpRun(Integer backupPumpRun) {
        this.backupPumpRun = backupPumpRun;
    }

    public Integer getFault() {
        return fault;
    }

    public void setFault(Integer fault) {
        this.fault = fault;
    }

    public Integer getFullOpen() {
        return fullOpen;
    }

    public void setFullOpen(Integer fullOpen) {
        this.fullOpen = fullOpen;
    }

    public Integer getFullClose() {
        return fullClose;
    }

    public void setFullClose(Integer fullClose) {
        this.fullClose = fullClose;
    }

    public Integer getChuanXiao() {
        return chuanXiao;
    }

    public void setChuanXiao(Integer chuanXiao) {
        this.chuanXiao = chuanXiao;
    }

    public Integer getTuoXiao() {
        return tuoXiao;
    }

    public void setTuoXiao(Integer tuoXiao) {
        this.tuoXiao = tuoXiao;
    }

    public Integer getLeftOpenValve() {
        return leftOpenValve;
    }

    public void setLeftOpenValve(Integer leftOpenValve) {
        this.leftOpenValve = leftOpenValve;
    }

    public Integer getLeftCloseValve() {
        return leftCloseValve;
    }

    public void setLeftCloseValve(Integer leftCloseValve) {
        this.leftCloseValve = leftCloseValve;
    }

    public Integer getRightOpenValve() {
        return rightOpenValve;
    }

    public void setRightOpenValve(Integer rightOpenValve) {
        this.rightOpenValve = rightOpenValve;
    }

    public Integer getRightCloseValve() {
        return rightCloseValve;
    }

    public void setRightCloseValve(Integer rightCloseValve) {
        this.rightCloseValve = rightCloseValve;
    }

    public Integer getLeftChuanXiaoValve() {
        return leftChuanXiaoValve;
    }

    public void setLeftChuanXiaoValve(Integer leftChuanXiaoValve) {
        this.leftChuanXiaoValve = leftChuanXiaoValve;
    }

    public Integer getLeftTuoXiaoValve() {
        return leftTuoXiaoValve;
    }

    public void setLeftTuoXiaoValve(Integer leftTuoXiaoValve) {
        this.leftTuoXiaoValve = leftTuoXiaoValve;
    }

    public Integer getRightChuanXiaoValve() {
        return rightChuanXiaoValve;
    }

    public void setRightChuanXiaoValve(Integer rightChuanXiaoValve) {
        this.rightChuanXiaoValve = rightChuanXiaoValve;
    }

    public Integer getRightTuoXiaoValve() {
        return rightTuoXiaoValve;
    }

    public void setRightTuoXiaoValve(Integer rightTuoXiaoValve) {
        this.rightTuoXiaoValve = rightTuoXiaoValve;
    }

    public BigDecimal getLeftOpening() {
        return leftOpening;
    }

    public void setLeftOpening(BigDecimal leftOpening) {
        this.leftOpening = leftOpening;
    }

    public BigDecimal getRightOpening() {
        return rightOpening;
    }

    public void setRightOpening(BigDecimal rightOpening) {
        this.rightOpening = rightOpening;
    }
}