package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (QysswjXxzxTYwPpwh)实体类
 *
 * @author makejava
 * @since 2019-09-25 09:33:43
 */
public class QysswjXxzxTYwPpwh implements Serializable {
    private static final long serialVersionUID = 418220045912918781L;
    //主键ID
    private Integer id;
    //品牌名称
    private String ppmc;

    private String lxid;

    private String lxmc;
    //创建时间
    @JsonFormat (pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;
    //状态
    private String zt;
    //备注
    private String bz;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPpmc() {
        return ppmc;
    }

    public void setPpmc(String ppmc) {
        this.ppmc = ppmc;
    }

    public String getLxid() {
        return lxid;
    }

    public void setLxid(String lxid) {
        this.lxid = lxid;
    }

    public String getLxmc() {
        return lxmc;
    }

    public void setLxmc(String lxmc) {
        this.lxmc = lxmc;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

}
