package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.impl;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper.QysswjXxzxTYwCgjhMapper;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwCgjh;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwCgjhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwCgjh)表服务实现类
 *
 * @author makejava
 * @since 2019-10-21 11:47:25
 */
@Service ("qysswjXxzxTYwCgjhService")
public class QysswjXxzxTYwCgjhServiceImpl implements QysswjXxzxTYwCgjhService {
    @Resource
    private QysswjXxzxTYwCgjhMapper qysswjXxzxTYwCgjhDao;


    @Override
    public List<QysswjXxzxTYwCgjh> getCgjhList(String cgjhmc, String qsrq, String zzrq, int pageNum, int pageSize) {

        List<QysswjXxzxTYwCgjh> cgjhList = new ArrayList<>();
        try {
            cgjhList = qysswjXxzxTYwCgjhDao.queryCgjh(cgjhmc, qsrq, zzrq, pageNum, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cgjhList;
    }

    @Override
    public int addCgjh(QysswjXxzxTYwCgjh qysswjXxzxTYwCgjh) {
        int id = qysswjXxzxTYwCgjhDao.insertCgjh(qysswjXxzxTYwCgjh);
        return id;

    }

    @Override
    public boolean editCgjhZt(String id) {
        boolean flag = true;
        try {
            flag = qysswjXxzxTYwCgjhDao.updateCgjhZt(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }

    @Override
    public int getCount(String cgjhmc, String qsrq, String zzrq) {
        int countNum = 0;
        try {
            countNum = qysswjXxzxTYwCgjhDao.queryCount(cgjhmc, qsrq, zzrq);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countNum;
    }
}
