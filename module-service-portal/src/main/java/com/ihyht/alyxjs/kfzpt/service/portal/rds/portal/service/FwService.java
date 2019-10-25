package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service;

import com.github.pagehelper.PageInfo;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper.*;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.*;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.service.*;
import java.util.List;

public interface FwService {

    boolean addFw(Fw fw);

    Fw findById(String id);

    boolean deleteFwById(String id);

    boolean updateFw(Fw fw);

    PageInfo selectFwByExample(Fw fw, Integer pageNo, Integer pageSize);

    List<Fw> selectAll();
}
