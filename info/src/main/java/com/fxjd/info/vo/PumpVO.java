package com.fxjd.info.vo;

import com.fxjd.info.pojo.ST_GATE_B;
import com.fxjd.info.pojo.ST_GATE_R;
import com.fxjd.info.pojo.ST_PUMP_R;
import com.fxjd.info.pojo.ST_WAS_R;
import lombok.Data;

import java.util.List;

@Data
public class PumpVO {
    private ST_WAS_R waterLevel;
    private List<ST_GATE_R> gates;
    private List<ST_PUMP_R> pumps;
}
