package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.impl;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper.QysswjXxzxTYwLbwhMapper;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwLbwh;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.QysswjXxzxTYwLbwhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwLbwh)表服务实现类
 *
 * @author makejava
 * @since 2019-09-21 10:03:42
 */
@Service ("qysswjXxzxTYwLbwhService")
public class QysswjXxzxTYwLbwhServiceImpl implements QysswjXxzxTYwLbwhService {
    @Resource
    private QysswjXxzxTYwLbwhMapper qysswjXxzxTYwLbwhDao;


    private List<QysswjXxzxTYwLbwh> ywLbwhList;

    @Override
    public List<QysswjXxzxTYwLbwh> getYwLbwhList(String lxid, String ppid, String xhid, String lbmc, Integer kcl,
                                                 int pageNum,
                                                 int pageSize) {
        try {
            ywLbwhList = new ArrayList<>();
            ywLbwhList = qysswjXxzxTYwLbwhDao.selectAllYwLbwhList(lxid, ppid, xhid, lbmc, kcl, pageNum,
                    pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ywLbwhList;
    }

    @Override
    public boolean addYwLbwh(String xhid, String xhmc, String lbmc, int fz, Double ysdj, int kcl) {

        boolean flag = true;
        try {
            qysswjXxzxTYwLbwhDao.insertYwLbwh(xhid, xhmc, lbmc, fz, ysdj, kcl);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean editYwLbwhZt(List<String> idList) {

        boolean flag = true;
        try {

            qysswjXxzxTYwLbwhDao.updateYwLbwhZt(idList);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public QysswjXxzxTYwLbwh getYwLbwhById(String id) {
        QysswjXxzxTYwLbwh ywLbwh = new QysswjXxzxTYwLbwh();
        try {
            ywLbwh = qysswjXxzxTYwLbwhDao.selectYwLbwhById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ywLbwh;
    }


    @Override
    public int getCount() {
        int countNum = 0;
        try {
            countNum = qysswjXxzxTYwLbwhDao.queryCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countNum;
    }

    @Override
    public boolean editYwLbwh(String id, String xhid, String xhmc, String lbmc, Integer fz, Double ysdj, Integer kcl,
                              String bz) {
        boolean flag = true;
        try {
            qysswjXxzxTYwLbwhDao.updateYwLbwh(id, xhid, xhmc, lbmc, fz, ysdj, kcl, bz);
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    //    @Override
//    public boolean editYwLbwh(String id, String xhid, String xhmc, String lbmc, Integer fz, Double ysdj, Integer kcl,
//                              String bz) {
//        boolean flag = true;
//        try {
//            qysswjXxzxTYwLbwhDao.updateYwLbwh(id, xhid, xhmc, lbmc, fz, ysdj, kcl, bz);
//        } catch (Exception e) {
//            flag = false;
//            e.printStackTrace();
//        }
//        return flag;
//    }

    //    @Override
//    public boolean editYwLbwh(String id, String xhid, String xhmc, String kcl, Double ysdj) {
//        boolean flag = true;
//        try {
//            qysswjXxzxTYwLbwhDao.updateYwLbwh(id, xhid, xhmc, kcl, ysdj);
//        } catch (Exception e) {
//            flag = false;
//            e.printStackTrace();
//        }
//        return flag;
//    }

    @Override
    public List<QysswjXxzxTYwLbwh> getLbwhListAuto() {

        List<QysswjXxzxTYwLbwh> ywLbwhList = new ArrayList<>();
        try {
            ywLbwhList = qysswjXxzxTYwLbwhDao.queryLbwhListAuto();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ywLbwhList;

    }
}
