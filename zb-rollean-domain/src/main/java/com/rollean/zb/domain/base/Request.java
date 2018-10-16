package com.rollean.zb.domain.base;

import java.io.Serializable;


public class Request implements Serializable {

    //外部请求号
    private String requestNo;
    // 扩展信息
    private String extinfo;

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getExtinfo() {
        return extinfo;
    }

    public void setExtinfo(String extinfo) {
        this.extinfo = extinfo;
    }


}
