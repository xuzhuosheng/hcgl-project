package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwLxwh;

import java.util.List;

/**
 * (QysswjXxzxTYwLxwh)表服务接口
 *
 * @author makejava
 * @since 2019-09-21 09:59:23
 */
public interface QysswjXxzxTYwLxwhService {


    List<QysswjXxzxTYwLxwh> getLxwhList(String lxmc, int pageNum, int pageSize);

    boolean addLxwh(String lxmc);

    boolean editLxwh(String id, String lxmc);

    boolean editLxwhZt(List<String> idList);

    QysswjXxzxTYwLxwh getLxwhById(String id);

    List<QysswjXxzxTYwLxwh> getAllLxwhList();

    int getCount();
}
