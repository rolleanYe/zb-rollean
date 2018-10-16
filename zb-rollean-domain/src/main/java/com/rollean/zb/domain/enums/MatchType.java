package com.rollean.zb.domain.enums;

/**
 * Created by rollean.
 */
public enum MatchType {

    BETWEEN("between", "区间"),
    GREETER("greeter","大于"),
    LOWER("lower","小于"),
    IN("in", "包含"),
    NOTNULL("notNull","不为空"),
    NULL("null","空");

    /** 代码 */
    private final String code;
    /** 信息 */
    private final String message;

    /**
     * 构造
     */
    MatchType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 通过代码获取
     */
    public static MatchType getByCode(String code) {
        if (code == null || code.trim().length() == 0) {
            return null;
        }

        for (MatchType type : MatchType.values()) {
            if (type.getCode().equals(code)) {
                return type;
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
