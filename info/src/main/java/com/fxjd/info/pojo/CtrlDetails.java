package com.fxjd.info.pojo;

import java.util.Date;

public class CtrlDetails {
    private Integer ID;

    private Integer ctrlRecordID;

    private Date time;

    private String record;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getCtrlRecordID() {
        return ctrlRecordID;
    }

    public void setCtrlRecordID(Integer ctrlRecordID) {
        this.ctrlRecordID = ctrlRecordID;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }
}