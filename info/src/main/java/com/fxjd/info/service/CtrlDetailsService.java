package com.fxjd.info.service;

import com.fxjd.info.pojo.CtrlDetails;

import java.util.List;

public interface CtrlDetailsService {
    int add(CtrlDetails ctrlDetails);

    List<CtrlDetails> getByCtrlRecordID(Integer ctrlRecordID);
}
