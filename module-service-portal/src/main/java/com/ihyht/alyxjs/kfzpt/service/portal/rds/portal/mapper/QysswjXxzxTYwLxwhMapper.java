package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwLxwh;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (QysswjXxzxTYwLxwh)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-21 09:59:22
 */
@Repository ("qysswjXxzxTYwLxwhDao")
public interface QysswjXxzxTYwLxwhMapper {



    List<QysswjXxzxTYwLxwh> selectAllLxwh(@Param ("lxmc") String lxmc,
                                          @Param ("pageNum") int pageNum, @Param ("pageSize") int pageSize);

    void insertLxwh(@Param ("lxmc") String lxmc);

    void updateLxwh(@Param ("id") String id, @Param ("lxmc") String lxmc);

    void updateLxwhZt(@Param ("idList") List<String> idList);

    QysswjXxzxTYwLxwh selectOneById(@Param ("id") String id);

    /**
     * 获取所有在用类型
     *
     * @return
     */
    List<QysswjXxzxTYwLxwh> selectAllZyLxwh();

    int queryCount();
}
