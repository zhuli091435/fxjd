package com.fxjd.info.vo;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class SendOrder {

    private String StationID;
    private String DeviceID;
    private String Time;
    private String UserID;
    private String OrderCode;
    private BigDecimal OrderParam;
    private int CtrlRecordID;
    private int IsExecute;
}
