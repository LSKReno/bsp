package com.bsp.server.exception;

public enum BusinessExceptionCode {

    LOGIN_USER_ERROR("用户名不存在或密码错误"),
    SIGNUP_USER_ERROR("注册用户名已存在"),
    ;

    private String desc;

    BusinessExceptionCode(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
