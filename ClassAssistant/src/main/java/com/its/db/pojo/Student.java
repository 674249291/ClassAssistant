package com.its.db.pojo;

import javax.persistence.*;

@Table(name = "t_student")
public class Student {
    /**
     * 主键id
     */
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "c_username")
    private String username;

    /**
     * 姓名
     */
    @Column(name = "c_name")
    private String name;

    /**
     * 个性签名
     */
    @Column(name = "c_perSign")
    private String persign;

    /**
     * 头像路径
     */
    @Column(name = "c_headImg")
    private String headimg;

    /**
     * 密码
     */
    @Column(name = "c_password")
    private String password;

    /**
     * 学校
     */
    @Column(name = "c_school")
    private String school;

    /**
     * 学号
     */
    @Column(name = "c_stuid")
    private String stuid;

    /**
     * 邮箱
     */
    @Column(name = "c_email")
    private String email;

    /**
     * 手机号
     */
    @Column(name = "c_telpthone")
    private String telpthone;

    /**
     * 删除标记
     */
    @Column(name = "c_del")
    private Boolean del;

    /**
     * 获取主键id
     *
     * @return c_id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return c_username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取姓名
     *
     * @return c_name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取个性签名
     *
     * @return c_perSign - 个性签名
     */
    public String getPersign() {
        return persign;
    }

    /**
     * 设置个性签名
     *
     * @param persign 个性签名
     */
    public void setPersign(String persign) {
        this.persign = persign;
    }

    /**
     * 获取头像路径
     *
     * @return c_headImg - 头像路径
     */
    public String getHeadimg() {
        return headimg;
    }

    /**
     * 设置头像路径
     *
     * @param headimg 头像路径
     */
    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    /**
     * 获取密码
     *
     * @return c_password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取学校
     *
     * @return c_school - 学校
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置学校
     *
     * @param school 学校
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取学号
     *
     * @return c_stuid - 学号
     */
    public String getStuid() {
        return stuid;
    }

    /**
     * 设置学号
     *
     * @param stuid 学号
     */
    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    /**
     * 获取邮箱
     *
     * @return c_email - 邮箱
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
     * 获取手机号
     *
     * @return c_telpthone - 手机号
     */
    public String getTelpthone() {
        return telpthone;
    }

    /**
     * 设置手机号
     *
     * @param telpthone 手机号
     */
    public void setTelpthone(String telpthone) {
        this.telpthone = telpthone;
    }

    /**
     * 获取删除标记
     *
     * @return c_del - 删除标记
     */
    public Boolean getDel() {
        return del;
    }

    /**
     * 设置删除标记
     *
     * @param del 删除标记
     */
    public void setDel(Boolean del) {
        this.del = del;
    }
}