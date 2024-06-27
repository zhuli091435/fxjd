package com.fxjd.info.vo;

import com.fxjd.info.pojo.ST_CABINET_R;
import com.fxjd.info.pojo.ST_RAIN_R;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class RainVO {
    private List<ST_CABINET_R> cabinet;
    private List<ST_RAIN_R> rain;
}
