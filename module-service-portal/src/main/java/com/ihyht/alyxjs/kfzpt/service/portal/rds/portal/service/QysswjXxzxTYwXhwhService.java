package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwXhwh;

import java.util.List;

/**
 * (QysswjXxzxTYwXhwh)表服务接口
 *
 * @author makejava
 * @since 2019-09-21 10:02:28
 */
public interface QysswjXxzxTYwXhwhService {


    List<QysswjXxzxTYwXhwh> getXhwhList(String lxid, String ppid, String xhmc, int pageNum, int pageSize);

    boolean addXhwh(String ppid, String ppmc, String xhmc);

    QysswjXxzxTYwXhwh getXhwhById(String id);

    boolean editXhwh(String ppid, String ppmc, String xhmc, String id);

    boolean editXhwhZt(List<String> idList);

    List<QysswjXxzxTYwXhwh> getXhwhListByPpid(String ppid);

    int getCount(String lxid, String ppid, String xhmc);
}
