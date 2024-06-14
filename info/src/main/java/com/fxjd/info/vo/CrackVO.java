package com.fxjd.info.vo;

import com.fxjd.info.pojo.ST_H_GATE_R;
import com.fxjd.info.pojo.ST_PUMP_R;
import lombok.Data;

import java.util.List;

@Data
public class CrackVO {
    private List<ST_H_GATE_R> gateList;
    private List<ST_PUMP_R> pumpList;
}
