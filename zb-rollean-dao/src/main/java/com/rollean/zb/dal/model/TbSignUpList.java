package com.rollean.zb.dal.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_sign_up_list")
public class TbSignUpList {
    /**
     * 主键(自增处理)
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 会员ID
     */
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 需求ID
     */
    @Column(name = "REQUIREMENT_ID")
    private Integer requirementId;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 获取主键(自增处理)
     *
     * @return ID - 主键(自增处理)
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键(自增处理)
     *
     * @param id 主键(自增处理)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取会员ID
     *
     * @return USER_ID - 会员ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置会员ID
     *
     * @param userId 会员ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取需求ID
     *
     * @return REQUIREMENT_ID - 需求ID
     */
    public Integer getRequirementId() {
        return requirementId;
    }

    /**
     * 设置需求ID
     *
     * @param requirementId 需求ID
     */
    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
     * 获取修改时间
     *
     * @return UPDATE_TIME - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}