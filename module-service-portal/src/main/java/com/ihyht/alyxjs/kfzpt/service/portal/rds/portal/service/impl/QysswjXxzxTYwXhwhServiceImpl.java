package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.impl;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper.QysswjXxzxTYwXhwhMapper;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwXhwh;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwXhwhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwXhwh)表服务实现类
 *
 * @author makejava
 * @since 2019-09-21 10:02:29
 */
@Service("qysswjXxzxTYwXhwhService")
public class QysswjXxzxTYwXhwhServiceImpl implements QysswjXxzxTYwXhwhService {
    @Resource
    private QysswjXxzxTYwXhwhMapper qysswjXxzxTYwXhwhDao;


    private List<QysswjXxzxTYwXhwh> xhwhList;

    @Override
    public List<QysswjXxzxTYwXhwh> getXhwhList(String lxid, String ppid, String xhmc, int pageNum, int pageSize) {
        try {
            xhwhList = new ArrayList<>();
            xhwhList = qysswjXxzxTYwXhwhDao.selectAllXhwh(lxid, ppid, xhmc, pageNum, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xhwhList;
    }

    @Override
    public boolean addXhwh(String ppid, String ppmc, String xhmc) {
        boolean flag = true;
        try {

            qysswjXxzxTYwXhwhDao.insertXhwh(ppid, ppmc, xhmc);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public QysswjXxzxTYwXhwh getXhwhById(String id) {
        QysswjXxzxTYwXhwh qysswjXxzxTYwXhwh = new QysswjXxzxTYwXhwh();
        try {
            qysswjXxzxTYwXhwh = qysswjXxzxTYwXhwhDao.selectOneById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qysswjXxzxTYwXhwh;
    }

    @Override
    public boolean editXhwhZt(List<String> idList) {
        boolean flag = true;
        try {
            qysswjXxzxTYwXhwhDao.updateXhwhZt(idList);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean editXhwh(String ppid, String ppmc, String xhmc, String id) {
        boolean flag = true;
        try {
            qysswjXxzxTYwXhwhDao.updateXhwh(ppid, ppmc, xhmc, id);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<QysswjXxzxTYwXhwh> getXhwhListByPpid(String ppid) {
        try {
            xhwhList = new ArrayList<>();
            xhwhList = qysswjXxzxTYwXhwhDao.selectXhwhListByPpid(ppid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xhwhList;
    }

    @Override
    public int getCount() {
        int countNum = 0;
        try {
            countNum = qysswjXxzxTYwXhwhDao.queryCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countNum;
    }
}
