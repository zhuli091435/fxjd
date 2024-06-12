package com.fxjd.info.service.impl;

import com.fxjd.info.mapper.CtrlDetailsMapper;
import com.fxjd.info.mapper.CtrlOrderMapper;
import com.fxjd.info.pojo.CtrlDetails;
import com.fxjd.info.service.CtrlDetailsService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtrlDetailsServiceImpl implements CtrlDetailsService {
    @Resource
    private CtrlDetailsMapper ctrlDetailsMapper;

    @Override
    public int add(CtrlDetails ctrlDetails) {
        return ctrlDetailsMapper.insert(ctrlDetails);
    }

    @Override
    public List<CtrlDetails> getByCtrlRecordID(Integer ctrlRecordID) {
        return ctrlDetailsMapper.selectByCtrlRecordID(ctrlRecordID);
    }
}
