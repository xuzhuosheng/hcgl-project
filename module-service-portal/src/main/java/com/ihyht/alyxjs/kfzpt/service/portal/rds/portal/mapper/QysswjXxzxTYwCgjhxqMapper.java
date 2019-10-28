package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwCgjhxq;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (QysswjXxzxTYwCgjhxq)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-21 11:47:29
 */
public interface QysswjXxzxTYwCgjhxqMapper {


    void insertCgjhxq(@Param ("cgjhid") Integer cgjhid, @Param ("lxmc") String lxmc, @Param ("ppmc") String ppmc,
                      @Param ("xhmc") String xhmc, @Param ("lbid")Integer lbid, @Param ("lbmc") String lbmc, @Param ("ysdj") Double ysdj, @Param (
            "cgsl") Integer cgsl);

    List<QysswjXxzxTYwCgjhxq> queryCgjhxqByCgjhid(@Param("cgjhid") String cgjhid);
}
