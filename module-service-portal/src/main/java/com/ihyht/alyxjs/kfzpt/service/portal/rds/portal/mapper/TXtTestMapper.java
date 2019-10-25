package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.TXtTest;
import org.apache.ibatis.annotations.Param;

public interface TXtTestMapper {
    TXtTest selectByPrimaryKey(@Param ("id") String id);
}
