package com.bsp.server.dto;


public class SequenceDto {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 序列名称

     */
    private String name;

    /**
     * 当前值

     */
    private Integer currentValue;

    /**
     * 增长值

     */
    private Integer increment;

    /**
     * 首字母

     */
    private String initial;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    public Integer getIncrement() {
        return increment;
    }

    public void setIncrement(Integer increment) {
        this.increment = increment;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
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
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", currentValue=").append(currentValue);
        sb.append(", increment=").append(increment);
        sb.append(", initial=").append(initial);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}