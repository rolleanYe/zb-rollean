package com.rollean.zb.domain.enums;

/**
 * Created by rollean.
 */
public enum RequirementType {

    WEB("1", " WEB应用"),
    APP("2", "移动应用"),
    WEIXIN("3","微信应用"),
    QIANRUSHI("4","嵌入式应用"),

    QT("99","其他")
    ;

    /** 代码 */
    private final String code;
    /** 信息 */
    private final String message;

    /**
     * 构造
     */
    RequirementType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过代码获取
     */
    public static RequirementType getByCode(String code) {
        if (code == null || code.trim().length() == 0) {
            return RequirementType.QT;
        }

        for (RequirementType type : RequirementType.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }

        return RequirementType.QT;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
