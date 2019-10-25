package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwXhwh;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (QysswjXxzxTYwXhwh)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-21 10:02:28
 */
public interface QysswjXxzxTYwXhwhMapper {


    List<QysswjXxzxTYwXhwh> selectAllXhwh(@Param ("lxid") String lxid, @Param ("ppid") String ppid,
                                          @Param ("xhmc") String xhmc, @Param ("pageNum") int pageNum,
                                          @Param ("pageSize") int pageSize);

    void insertXhwh(@Param ("ppid") String ppid, @Param ("ppmc") String ppmc, @Param ("xhmc") String xhmc);

    QysswjXxzxTYwXhwh selectOneById(String id);

    void updateXhwh(@Param ("ppid") String ppid, @Param ("ppmc") String ppmc,
                    @Param ("xhmc") String xhmc, @Param ("id") String id);

    void updateXhwhZt(@Param ("idList") List<String> idList);

    List<QysswjXxzxTYwXhwh> selectXhwhListByPpid(@Param("ppid") String ppid);

    int queryCount();
}
