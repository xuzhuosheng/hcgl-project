package com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model;

import com.ihyht.alyxjs.nbjcpt.component.generator.IdEntity;
import java.io.Serializable;
import java.util.Date;

public class Fw extends IdEntity implements Serializable {
    /**
     * 主键ID
     * 表 : t_alyzcfw_fw
     * 对应字段 : ID
     */
    private String id;

    /**
     * 服务名称
     * 表 : t_alyzcfw_fw
     * 对应字段 : FWMC
     */
    private String fwmc;

    /**
     * 服务描述
     * 表 : t_alyzcfw_fw
     * 对应字段 : FWMS
     */
    private String fwms;

    /**
     * 服务分类ID
     * 表 : t_alyzcfw_fw
     * 对应字段 : FWFL_ID
     */
    private String fwflId;

    /**
     * 录入日期
     * 表 : t_alyzcfw_fw
     * 对应字段 : LRRQ
     */
    private Date lrrq;

    /**
     * 修改日期
     * 表 : t_alyzcfw_fw
     * 对应字段 : XGRQ
     */
    private Date xgrq;

    /**
     * 有效标志
     * 表 : t_alyzcfw_fw
     * 对应字段 : YXBZ
     */
    private String yxbz;

    /**
     * 删除标志
     * 表 : t_alyzcfw_fw
     * 对应字段 : SCBZ
     */
    private String scbz;

    /**
     * 图标ID
     * 表 : t_alyzcfw_fw
     * 对应字段 : ICON_ID
     */
    private String iconId;

    /**
     * 导航地址
     * 表 : t_alyzcfw_fw
     * 对应字段 : URL
     */
    private String url;

    /**
     * 
     * 表 : t_alyzcfw_fw
     * 对应字段 : XH
     */
    private Long xh;

    /**
     * 后台api地址
     * 表 : t_alyzcfw_fw
     * 对应字段 : API_URL
     */
    private String apiUrl;

    /**
     * swagger接口同步批次号
     * 表 : t_alyzcfw_fw
     * 对应字段 : PCH
     */
    private String pch;

    /**
     * 展示顺序（前台用）
     * 表 : t_alyzcfw_fw
     * 对应字段 : zssx
     */
    private Integer zssx;

    private static final long serialVersionUID = 1L;

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.ID：主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * set method 
     *
     * @param id  主键ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.FWMC：服务名称
     */
    public String getFwmc() {
        return fwmc;
    }

    /**
     * set method 
     *
     * @param fwmc  服务名称
     */
    public void setFwmc(String fwmc) {
        this.fwmc = fwmc == null ? null : fwmc.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.FWMS：服务描述
     */
    public String getFwms() {
        return fwms;
    }

    /**
     * set method 
     *
     * @param fwms  服务描述
     */
    public void setFwms(String fwms) {
        this.fwms = fwms == null ? null : fwms.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.FWFL_ID：服务分类ID
     */
    public String getFwflId() {
        return fwflId;
    }

    /**
     * set method 
     *
     * @param fwflId  服务分类ID
     */
    public void setFwflId(String fwflId) {
        this.fwflId = fwflId == null ? null : fwflId.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.LRRQ：录入日期
     */
    public Date getLrrq() {
        return lrrq;
    }

    /**
     * set method 
     *
     * @param lrrq  录入日期
     */
    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.XGRQ：修改日期
     */
    public Date getXgrq() {
        return xgrq;
    }

    /**
     * set method 
     *
     * @param xgrq  修改日期
     */
    public void setXgrq(Date xgrq) {
        this.xgrq = xgrq;
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.YXBZ：有效标志
     */
    public String getYxbz() {
        return yxbz;
    }

    /**
     * set method 
     *
     * @param yxbz  有效标志
     */
    public void setYxbz(String yxbz) {
        this.yxbz = yxbz == null ? null : yxbz.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.SCBZ：删除标志
     */
    public String getScbz() {
        return scbz;
    }

    /**
     * set method 
     *
     * @param scbz  删除标志
     */
    public void setScbz(String scbz) {
        this.scbz = scbz == null ? null : scbz.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.ICON_ID：图标ID
     */
    public String getIconId() {
        return iconId;
    }

    /**
     * set method 
     *
     * @param iconId  图标ID
     */
    public void setIconId(String iconId) {
        this.iconId = iconId == null ? null : iconId.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.URL：导航地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * set method 
     *
     * @param url  导航地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.XH：
     */
    public Long getXh() {
        return xh;
    }

    /**
     * set method 
     *
     * @param xh  
     */
    public void setXh(Long xh) {
        this.xh = xh;
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.API_URL：后台api地址
     */
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     * set method 
     *
     * @param apiUrl  后台api地址
     */
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl == null ? null : apiUrl.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.PCH：swagger接口同步批次号
     */
    public String getPch() {
        return pch;
    }

    /**
     * set method 
     *
     * @param pch  swagger接口同步批次号
     */
    public void setPch(String pch) {
        this.pch = pch == null ? null : pch.trim();
    }

    /**
     * get method 
     *
     * @return t_alyzcfw_fw.zssx：展示顺序（前台用）
     */
    public Integer getZssx() {
        return zssx;
    }

    /**
     * set method 
     *
     * @param zssx  展示顺序（前台用）
     */
    public void setZssx(Integer zssx) {
        this.zssx = zssx;
    }
}