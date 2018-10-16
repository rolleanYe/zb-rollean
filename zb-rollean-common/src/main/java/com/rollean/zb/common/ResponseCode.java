package com.rollean.zb.common;

/**
 * 应答码定义
 */
public enum ResponseCode {

    SUCCESS("0", "处理成功"),
    UNKNOWN("999", "异常失败");

    /** 代码 */
    private final String code;
    /** 信息 */
    private final String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过代码获取枚举项
     * @param code
     * @return
     */
    public static ResponseCode getByCode(String code) {
        if (code == null) {
            return null;
        }

        for (ResponseCode responseCode : ResponseCode.values()) {
            if (responseCode.getCode().equals(code)) {
                return responseCode;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
