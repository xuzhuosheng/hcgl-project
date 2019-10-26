package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwCgjh;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * (QysswjXxzxTYwCgjh)表数据库访问层
 *
 * @author makejava
 * @since 2019-10-21 11:47:16
 */
public interface QysswjXxzxTYwCgjhMapper {


    List<QysswjXxzxTYwCgjh> queryYwLbwh(@Param ("cgjhmc") String cgjhmc, @Param ("qsrq") String qsrq,
                                        @Param ("zzrq") String zzrq, @Param ("pageNum") int pageNum,
                                        @Param ("pageSize") int pageSize);

    int insertCgjh(@Param ("qysswjXxzxTYwCgjh") QysswjXxzxTYwCgjh qysswjXxzxTYwCgjh);

    int queryCount();
}
