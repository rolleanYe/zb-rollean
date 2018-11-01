package com.rollean.zb.domain.enums;

/**
 * Created by rollean.
 */
public enum DevelopmentLanguage {

    Java("Java", "Java"),
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
    DevelopmentLanguage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过代码获取
     */
    public static DevelopmentLanguage getByCode(String code) {
        if (code == null || code.trim().length() == 0) {
            return DevelopmentLanguage.QT;
        }

        for (DevelopmentLanguage type : DevelopmentLanguage.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }

        return DevelopmentLanguage.QT;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
