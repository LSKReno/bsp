package com.bsp.server.dto;


public class SysUserDto {

    /**
     * 主键

     */
    private Integer userId;

    /**
     * 用户名，唯一

     */
    private String username;

    /**
     * 密码

     */
    private String password;

    /**
     * 昵称（可重复）

     */
    private String name;

    /**
     * 权限

     */
    private String rights;

    /**
     * 角色ID

     */
    private String roleId;

    /**
     * 上次登录时间

     */
    private String lastLogin;

    /**
     * 登录IP

     */
    private String ip;

    /**
     * 状态

     */
    private String status;

    /**
     * 备注

     */
    private String bz;

    /**
     * 皮肤样式

     */
    private String skin;

    /**
     * 邮箱

     */
    private String email;

    /**
     * 固话号码

     */
    private String number;

    /**
     * 手机

     */
    private String phone;

    /**
     * 产商,借卖方ID

     */
    private Integer manBuyerId;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getManBuyerId() {
        return manBuyerId;
    }

    public void setManBuyerId(Integer manBuyerId) {
        this.manBuyerId = manBuyerId;
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
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", rights=").append(rights);
        sb.append(", roleId=").append(roleId);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", ip=").append(ip);
        sb.append(", status=").append(status);
        sb.append(", bz=").append(bz);
        sb.append(", skin=").append(skin);
        sb.append(", email=").append(email);
        sb.append(", number=").append(number);
        sb.append(", phone=").append(phone);
        sb.append(", manBuyerId=").append(manBuyerId);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}