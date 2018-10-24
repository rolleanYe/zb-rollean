package com.rollean.zb.domain.enums;

/**
 * Created by rollean.
 */
public enum ProjectType {

    XM("1", "项目"),
    XS("2","悬赏"),
    QT("9","其他");

    /** 代码 */
    private final String code;
    /** 信息 */
    private final String message;

    /**
     * 构造
     */
    ProjectType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过代码获取
     */
    public static ProjectType getByCode(String code) {
        if (code == null || code.trim().length() == 0) {
            return ProjectType.QT;
        }

        for (ProjectType type : ProjectType.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }

        return ProjectType.QT;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
