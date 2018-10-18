package com.rollean.zb.dal.model;

import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    /**
     * 主键(自增处理)
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 昵称
     */
    @Column(name = "NICKNAME")
    private String nickname;

    /**
     * 年龄
     */
    @Column(name = "AGE")
    private Integer age;

    /**
     * 手机号
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 密码
     */
    @Column(name = "PWD")
    private String pwd;

    /**
     * 性别(0保密 1男 2女)
     */
    @Column(name = "GENDER")
    private Integer gender;

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
     * 获取昵称
     *
     * @return NICKNAME - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取年龄
     *
     * @return AGE - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取手机号
     *
     * @return MOBILE - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取密码
     *
     * @return PWD - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取性别(0保密 1男 2女)
     *
     * @return GENDER - 性别(0保密 1男 2女)
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别(0保密 1男 2女)
     *
     * @param gender 性别(0保密 1男 2女)
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }
}