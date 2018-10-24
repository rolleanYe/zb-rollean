package com.rollean.zb.domain;

import java.util.Date;
import java.util.List;

public class RequirementVo {
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 项目类型：项目，悬赏
     */
    private Integer projectType;

    private String projectTypeStr;

    /**
     * 主题
     */
    private String subjectDesc;

    /**
     * 需求类型
     */
    private Integer requirementType;

    private String requirementTypeStr;

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
     * 创建人
     */
    private User user;

    /**
     * 报名用户
     */
    private List<User> signUpList;


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

    public List<User> getSignUpList() {
        return signUpList;
    }

    public void setSignUpList(List<User> signUpList) {
        this.signUpList = signUpList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProjectTypeStr() {
        return projectTypeStr;
    }

    public void setProjectTypeStr(String projectTypeStr) {
        this.projectTypeStr = projectTypeStr;
    }

    public String getRequirementTypeStr() {
        return requirementTypeStr;
    }

    public void setRequirementTypeStr(String requirementTypeStr) {
        this.requirementTypeStr = requirementTypeStr;
    }
}



