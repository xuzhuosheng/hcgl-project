package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.mapper;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.Fw;
import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.FwExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FwMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(FwExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(FwExample example);

    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Fw record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Fw record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<Fw> selectByExample(FwExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Fw selectByPrimaryKey(String id);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Fw record, @Param("example") FwExample example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Fw record, @Param("example") FwExample example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Fw record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Fw record);
}