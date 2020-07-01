package com.bsp.server.dto;

import java.math.BigDecimal;

public class PckPackageInfoDto {

    /**
     * 主键

     */
    private Integer pckId;

    /**
     * 仓库ID

     */
    private Integer warId;

    /**
     * 绑定的 PRO_ID 与 VAR_ID 只可能有一个

     */
    private Integer proId;

    /**
     * 对应master 表PAC_REGISTER M - 厂家设定 W - 仓库注册

     */
    private String typeCd;

    /**
     * 宽 - cm

     */
    private BigDecimal width;

    /**
     * 高 - cm

     */
    private BigDecimal height;

    /**
     * 长 - cm

     */
    private BigDecimal length;

    /**
     * 重 - kg

     */
    private BigDecimal weight;

    /**
     * 创建人

     */
    private String createdBy;

    /**
     * 创建时间

     */
    private String creationDate;

    /**
     * 修改人

     */
    private String lastUpdateBy;

    /**
     * 修改时间

     */
    private String lastUpdateDate;

    /**
     * 乐观锁

     */
    private Integer callCnt;

    /**
     * 备注

     */
    private String remark;

    /**
     * 状态

     */
    private String stsCd;

    /**
     * 卡车管道

     */
    private String heavyCargo;

    /**
     * 管道公司

     */
    private String logisticsCompany;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getPckId() {
        return pckId;
    }

    public void setPckId(Integer pckId) {
        this.pckId = pckId;
    }

    public Integer getWarId() {
        return warId;
    }

    public void setWarId(Integer warId) {
        this.warId = warId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStsCd() {
        return stsCd;
    }

    public void setStsCd(String stsCd) {
        this.stsCd = stsCd;
    }

    public String getHeavyCargo() {
        return heavyCargo;
    }

    public void setHeavyCargo(String heavyCargo) {
        this.heavyCargo = heavyCargo;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pckId=").append(pckId);
        sb.append(", warId=").append(warId);
        sb.append(", proId=").append(proId);
        sb.append(", typeCd=").append(typeCd);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", length=").append(length);
        sb.append(", weight=").append(weight);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", heavyCargo=").append(heavyCargo);
        sb.append(", logisticsCompany=").append(logisticsCompany);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}