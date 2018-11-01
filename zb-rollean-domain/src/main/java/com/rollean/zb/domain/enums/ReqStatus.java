package com.rollean.zb.domain.enums;

/**
 * Created by rollean.
 */
public enum ReqStatus {

    BID_ING("1", "竞标中"),
    IMP_ING("2","实施中"),
    SUCCESS("3","完成"),
    QT("9","其他");

    /** 代码 */
    private final String code;
    /** 信息 */
    private final String message;

    /**
     * 构造
     */
    ReqStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过代码获取
     */
    public static ReqStatus getByCode(String code) {
        if (code == null || code.trim().length() == 0) {
            return ReqStatus.QT;
        }

        for (ReqStatus type : ReqStatus.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }

        return ReqStatus.QT;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
