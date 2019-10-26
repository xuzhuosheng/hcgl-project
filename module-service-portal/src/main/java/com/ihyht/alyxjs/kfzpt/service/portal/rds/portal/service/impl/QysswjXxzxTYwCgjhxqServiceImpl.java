package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.impl;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper.QysswjXxzxTYwCgjhxqMapper;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwLbwh;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwCgjhxqService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (QysswjXxzxTYwCgjhxq)表服务实现类
 *
 * @author makejava
 * @since 2019-10-21 11:47:29
 */
@Service ("qysswjXxzxTYwCgjhxqService")
public class QysswjXxzxTYwCgjhxqServiceImpl implements QysswjXxzxTYwCgjhxqService {
    @Resource
    private QysswjXxzxTYwCgjhxqMapper qysswjXxzxTYwCgjhxqDao;


    @Override
    public boolean addCgjhXq(Integer cgjhid, QysswjXxzxTYwLbwh qysswjXxzxTYwLbwh, Integer cgsl) {
        boolean flag = true;

        try {
            qysswjXxzxTYwCgjhxqDao.insertCgjhxq(cgjhid, qysswjXxzxTYwLbwh.getLxmc(), qysswjXxzxTYwLbwh.getPpmc(),
                    qysswjXxzxTYwLbwh.getXhmc(), qysswjXxzxTYwLbwh.getLbmc(),
                    Double.parseDouble(qysswjXxzxTYwLbwh.getYsdj()), cgsl);

        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }

        return flag;

    }
}
