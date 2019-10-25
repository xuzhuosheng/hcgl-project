package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.impl;


import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper.TXtTestMapper;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.TXtTest;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.TXtTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TXtTestServiceImpl implements TXtTestService {

    @Autowired
    private TXtTestMapper tXtTestMapper;

    @Override
    public TXtTest findById(String id) {
        TXtTest  CeShi = tXtTestMapper.selectByPrimaryKey(id);
        return CeShi;
    }
}
