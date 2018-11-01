package com.rollean.zb.dal.model;

import java.util.Date;

/**
 * Created by rollean.
 */
public class Requirement {


    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户昵称
     */
    private String nickname;

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


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }

    public Integer getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(Integer requirementType) {
        this.requirementType = requirementType;
    }

    public String getRequirementDesc() {
        return requirementDesc;
    }

    public void setRequirementDesc(String requirementDesc) {
        this.requirementDesc = requirementDesc;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
