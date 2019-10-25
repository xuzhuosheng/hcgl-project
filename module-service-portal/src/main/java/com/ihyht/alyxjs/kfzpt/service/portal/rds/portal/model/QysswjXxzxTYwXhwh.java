package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (QysswjXxzxTYwXhwh)实体类
 *
 * @author makejava
 * @since 2019-09-25 09:33:43
 */
public class QysswjXxzxTYwXhwh implements Serializable {
    private static final long serialVersionUID = 899828646417005723L;
    //主键 ID
    private Integer id;
    //型号
    private String xhmc;

    private String ppid;

    private String ppmc;
    //创建时间
    @JsonFormat (pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;
    //状态
    private String zt;
    //备注
    private String bz;

    //    ################
    private String lxid;
    private String lxmc;

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
    //    ################


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXhmc() {
        return xhmc;
    }

    public void setXhmc(String xhmc) {
        this.xhmc = xhmc;
    }

    public String getPpid() {
        return ppid;
    }

    public void setPpid(String ppid) {
        this.ppid = ppid;
    }

    public String getPpmc() {
        return ppmc;
    }

    public void setPpmc(String ppmc) {
        this.ppmc = ppmc;
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
