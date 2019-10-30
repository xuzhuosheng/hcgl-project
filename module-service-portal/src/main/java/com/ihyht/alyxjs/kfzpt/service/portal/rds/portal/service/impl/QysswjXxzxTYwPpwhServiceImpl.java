package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.impl;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper.QysswjXxzxTYwPpwhMapper;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwPpwh;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwPpwhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwPpwh)表服务实现类
 *
 * @author makejava
 * @since 2019-09-21 10:01:41
 */
@Service ("qysswjXxzxTYwPpwhService")
public class QysswjXxzxTYwPpwhServiceImpl implements QysswjXxzxTYwPpwhService {
    @Resource
    private QysswjXxzxTYwPpwhMapper qysswjXxzxTYwPpwhDao;

    private List<QysswjXxzxTYwPpwh> ppwhList;

    @Override
    public List<QysswjXxzxTYwPpwh> getPpwhList(String lxid, String ppmc, int pageNum, int pageSize) {
        ppwhList = new ArrayList<>();
        try {

            ppwhList = qysswjXxzxTYwPpwhDao.selectAllPpwh(lxid, ppmc, pageNum, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ppwhList;
    }

    @Override
    public boolean addPpwh(String lxid, String lxmc, String ppmc) {
        boolean flag = true;
        try {

            qysswjXxzxTYwPpwhDao.insertPpwh(lxid, lxmc, ppmc);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean editPpwh(String id, String ppmc, String lxid, String lxmc) {
        boolean flag = true;
        try {

            qysswjXxzxTYwPpwhDao.updatePpwh(id, ppmc, lxid, lxmc);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean editPpwhZt(List<String> idList) {
        boolean flag = true;
        try {
            qysswjXxzxTYwPpwhDao.updatePpwhZt(idList);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public QysswjXxzxTYwPpwh getPpwhById(String id) {
        QysswjXxzxTYwPpwh qysswjXxzxTYwPpwh = new QysswjXxzxTYwPpwh();
        try {
            qysswjXxzxTYwPpwh = qysswjXxzxTYwPpwhDao.selectOneById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qysswjXxzxTYwPpwh;
    }

    @Override
    public List<QysswjXxzxTYwPpwh> getPpwhListByLxid(String lxid) {
        try {
            ppwhList = new ArrayList<>();
            ppwhList = qysswjXxzxTYwPpwhDao.selectAllPpwhByLxid(lxid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ppwhList;
    }

    @Override
    public int getCount(String lxid, String ppmc) {
        int countNum = 0;
        try {
            countNum = qysswjXxzxTYwPpwhDao.queryCount(lxid, ppmc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countNum;
    }


}
