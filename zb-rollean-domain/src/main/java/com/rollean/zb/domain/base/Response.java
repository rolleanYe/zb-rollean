package com.rollean.zb.domain.base;

import java.io.Serializable;

public class Response implements Serializable {

    // 返回码
    private String responseCode;
    // 返回消息
    private String responseMessage;
    // 扩展信息
    private String extinfo;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getExtinfo() {
        return extinfo;
    }

    public void setExtinfo(String extinfo) {
        this.extinfo = extinfo;
    }

}
