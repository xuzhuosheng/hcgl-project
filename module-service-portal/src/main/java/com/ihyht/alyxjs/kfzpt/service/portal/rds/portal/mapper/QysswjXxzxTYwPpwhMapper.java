package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwPpwh;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (QysswjXxzxTYwPpwh)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-21 10:01:41
 */
public interface QysswjXxzxTYwPpwhMapper {


    List<QysswjXxzxTYwPpwh> selectAllPpwh(@Param ("lxid") String lxid, @Param ("ppmc") String ppmc,
                                          @Param ("pageNum") int pageNum, @Param ("pageSize") int pageSize);

    void insertPpwh(@Param ("lxid") String lxid, @Param ("lxmc") String lxmc, @Param ("ppmc") String ppmc);

    void updatePpwh(@Param ("id") String id, @Param ("ppmc") String ppmc, @Param ("lxid") String lxid,
                    @Param ("lxmc") String lxmc);

    void updatePpwhZt(@Param ("idList") List<String> idList);

    QysswjXxzxTYwPpwh selectOneById(@Param ("id") String id);

    List<QysswjXxzxTYwPpwh> selectAllPpwhByLxid(@Param ("lxid") String lxid);

    int queryCount();

//    int insertPpwh(@Param ("ppmc") String ppmc);
}
