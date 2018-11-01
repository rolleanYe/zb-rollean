package com.rollean.zb.dal.model;

import javax.persistence.*;

@Table(name = "tb_code_table")
public class TbCodeTable {
    /**
     * 字典ID
     */
    @Id
    @Column(name = "CODE_ID")
    private Integer codeId;

    /**
     * 字典标识
     */
    @Column(name = "CODE_KEY")
    private String codeKey;

    /**
     * 属性名称
     */
    @Column(name = "ATTR_NAME")
    private String attrName;

    /**
     * 属性标识
     */
    @Column(name = "ATTR_KEY")
    private String attrKey;

    /**
     * 属性值
     */
    @Column(name = "ATTR_VALUE")
    private String attrValue;

    /**
     * 是否使用
     */
    @Column(name = "ENABLE")
    private String enable;

    /**
     * 获取字典ID
     *
     * @return CODE_ID - 字典ID
     */
    public Integer getCodeId() {
        return codeId;
    }

    /**
     * 设置字典ID
     *
     * @param codeId 字典ID
     */
    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    /**
     * 获取字典标识
     *
     * @return CODE_KEY - 字典标识
     */
    public String getCodeKey() {
        return codeKey;
    }

    /**
     * 设置字典标识
     *
     * @param codeKey 字典标识
     */
    public void setCodeKey(String codeKey) {
        this.codeKey = codeKey;
    }

    /**
     * 获取属性名称
     *
     * @return ATTR_NAME - 属性名称
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * 设置属性名称
     *
     * @param attrName 属性名称
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    /**
     * 获取属性标识
     *
     * @return ATTR_KEY - 属性标识
     */
    public String getAttrKey() {
        return attrKey;
    }

    /**
     * 设置属性标识
     *
     * @param attrKey 属性标识
     */
    public void setAttrKey(String attrKey) {
        this.attrKey = attrKey;
    }

    /**
     * 获取属性值
     *
     * @return ATTR_VALUE - 属性值
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * 设置属性值
     *
     * @param attrValue 属性值
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    /**
     * 获取是否使用
     *
     * @return ENABLE - 是否使用
     */
    public String getEnable() {
        return enable;
    }

    /**
     * 设置是否使用
     *
     * @param enable 是否使用
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }
}