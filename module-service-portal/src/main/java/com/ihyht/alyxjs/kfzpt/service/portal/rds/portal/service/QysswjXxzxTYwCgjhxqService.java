package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwCgjhxq;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwLbwh;

import java.util.List;

/**
 * (QysswjXxzxTYwCgjhxq)表服务接口
 *
 * @author makejava
 * @since 2019-10-21 11:47:29
 */
public interface QysswjXxzxTYwCgjhxqService {


    boolean addCgjhXq(Integer cgjhid, QysswjXxzxTYwLbwh qysswjXxzxTYwLbwh, Integer cgsl);

    List<QysswjXxzxTYwCgjhxq> getCgjhxqByCgjhid(String cgjhid);
}
