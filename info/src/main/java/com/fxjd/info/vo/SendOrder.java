package com.fxjd.info.vo;


import lombok.Data;

@Data
public class SendOrder {

    private String StationID;
    private String DeviceID;
    private String Time;
    private String UserID;
    private String State;
    private double GTOPHGT;
    private int CtrlRecordID;
    private int IsExecute;
}
