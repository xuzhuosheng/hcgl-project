package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwCgjh;

import java.util.List;

/**
 * (QysswjXxzxTYwCgjh)表服务接口
 *
 * @author makejava
 * @since 2019-10-21 11:47:20
 */
public interface QysswjXxzxTYwCgjhService {


    List<QysswjXxzxTYwCgjh> getYwLbwhList(String cgjhmc, String qsrq, String zzrq, int pageNum, int pageSize);

    int addCgjh(QysswjXxzxTYwCgjh qysswjXxzxTYwCgjh);

    int getCount();

    boolean editCgjhZt(String id);
}
