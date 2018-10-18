package com.rollean.zb.domain;

import java.util.Date;

public class Requirement {
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 项目类型：项目，悬赏
     */
    private Integer projectType;

    /**
     * 主题
     */
    private String subjectDesc;

    /**
     * 需求类型
     */
    private Integer requirementType;

    /**
     * 需求描述
     */
    private String requirementDesc;

    /**
     * 技能要求
     */
    private String skills;

    /**
     * 价格
     */
    private String price;

    /**
     * 周期
     */
    private String cycle;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 附件
     */
    private String attachment;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date updateTime;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return USER_ID - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取项目类型：项目，悬赏
     *
     * @return PROJECT_TYPE - 项目类型：项目，悬赏
     */
    public Integer getProjectType() {
        return projectType;
    }

    /**
     * 设置项目类型：项目，悬赏
     *
     * @param projectType 项目类型：项目，悬赏
     */
    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    /**
     * 获取主题
     *
     * @return SUBJECT_DESC - 主题
     */
    public String getSubjectDesc() {
        return subjectDesc;
    }

    /**
     * 设置主题
     *
     * @param subjectDesc 主题
     */
    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }

    /**
     * 获取需求类型
     *
     * @return REQUIREMENT_TYPE - 需求类型
     */
    public Integer getRequirementType() {
        return requirementType;
    }

    /**
     * 设置需求类型
     *
     * @param requirementType 需求类型
     */
    public void setRequirementType(Integer requirementType) {
        this.requirementType = requirementType;
    }

    /**
     * 获取需求描述
     *
     * @return REQUIREMENT_DESC - 需求描述
     */
    public String getRequirementDesc() {
        return requirementDesc;
    }

    /**
     * 设置需求描述
     *
     * @param requirementDesc 需求描述
     */
    public void setRequirementDesc(String requirementDesc) {
        this.requirementDesc = requirementDesc;
    }

    /**
     * 获取技能要求
     *
     * @return SKILLS - 技能要求
     */
    public String getSkills() {
        return skills;
    }

    /**
     * 设置技能要求
     *
     * @param skills 技能要求
     */
    public void setSkills(String skills) {
        this.skills = skills;
    }

    /**
     * 获取价格
     *
     * @return PRICE - 价格
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 获取周期
     *
     * @return CYCLE - 周期
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * 设置周期
     *
     * @param cycle 周期
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取附件
     *
     * @return ATTACHMENT - 附件
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * 设置附件
     *
     * @param attachment 附件
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后修改时间
     *
     * @return UPDATE_TIME - 最后修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param updateTime 最后修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}