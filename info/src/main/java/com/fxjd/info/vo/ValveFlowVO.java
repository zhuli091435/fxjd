package com.fxjd.info.vo;

import com.fxjd.info.pojo.ST_Flow_R;
import com.fxjd.info.pojo.ST_Valve_R;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ValveFlowVO {
    private List<ST_Flow_R> flow;
    private List<ST_Valve_R> valve;
}
