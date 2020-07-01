package com.bsp.server.dto;


public class MorMonitorResultDto {

    /**
     * 主键
     */
    private Integer morId;

    /**
     * 类名

     */
    private String className;

    /**
     * Json字符串

     */
    private String jsonString;

    /**
     * 创建时间

     */
    private String createDate;

    /**
     * 创建人

     */
    private String createBy;

    /**
     * 更新时间

     */
    private String updateDate;

    /**
     * 更新人

     */
    private String updateBy;

    /**
     * 描述

     */
    private String remark;

    /**
     * 状态

     */
    private String stsCd;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getMorId() {
        return morId;
    }

    public void setMorId(Integer morId) {
        this.morId = morId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
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
        sb.append(", morId=").append(morId);
        sb.append(", className=").append(className);
        sb.append(", jsonString=").append(jsonString);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}