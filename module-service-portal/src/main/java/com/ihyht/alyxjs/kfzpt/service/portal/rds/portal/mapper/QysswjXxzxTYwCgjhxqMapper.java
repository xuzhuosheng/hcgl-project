package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * (QysswjXxzxTYwCgjhxq)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-21 11:47:29
 */
public interface QysswjXxzxTYwCgjhxqMapper {


    void insertCgjhxq(@Param ("cgjhId") Integer cgjhId, @Param ("lxmc") String lxmc, @Param ("ppmc") String ppmc,
                      @Param ("xhmc") String xhmc, @Param ("lbmc") String lbmc, @Param ("ysdj") Double ysdj, @Param (
                              "cgsl") Integer cgsl);
}
