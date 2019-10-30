package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.impl;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper.QysswjXxzxTYwLxwhMapper;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwLxwh;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwLxwhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwLxwh)表服务实现类
 *
 * @author makejava
 * @since 2019-09-21 09:59:23
 */
@Service ("qysswjXxzxTYwLxwhService")
public class QysswjXxzxTYwLxwhServiceImpl implements QysswjXxzxTYwLxwhService {
    @Resource
    private QysswjXxzxTYwLxwhMapper qysswjXxzxTYwLxwhDao;


    private List<QysswjXxzxTYwLxwh> lxwhList;

    @Override
    public List<QysswjXxzxTYwLxwh> getLxwhList(String lxmc, int pageNum, int pageSize) {
        lxwhList = new ArrayList<>();
        try {
            lxwhList = qysswjXxzxTYwLxwhDao.selectAllLxwh(lxmc, pageNum, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lxwhList;
    }

    @Override
    public boolean addLxwh(String lxmc) {
        boolean flag = true;
        try {
            qysswjXxzxTYwLxwhDao.insertLxwh(lxmc);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean editLxwh(String id, String lxmc) {
        boolean flag = true;
        try {
            qysswjXxzxTYwLxwhDao.updateLxwh(id, lxmc);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean editLxwhZt(List<String> idList) {
        boolean flag = true;
        try {
            qysswjXxzxTYwLxwhDao.updateLxwhZt(idList);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public QysswjXxzxTYwLxwh getLxwhById(String id) {
        QysswjXxzxTYwLxwh ywLxwh = new QysswjXxzxTYwLxwh();
        try {
            ywLxwh = qysswjXxzxTYwLxwhDao.selectOneById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ywLxwh;
    }

    @Override
    public List<QysswjXxzxTYwLxwh> getAllLxwhList() {
        lxwhList = new ArrayList<>();
        try {
            lxwhList = qysswjXxzxTYwLxwhDao.selectAllZyLxwh();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lxwhList;
    }

    public int getCount(String lxmc) {
        int countNum = 0;
        try {
            countNum = qysswjXxzxTYwLxwhDao.queryCount(lxmc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countNum;
    }


}
