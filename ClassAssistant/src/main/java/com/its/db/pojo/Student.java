package com.its.db.pojo;

import javax.persistence.*;

@Table(name = "t_student")
public class Student {
    /**
     * ����id
     */
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * �û���
     */
    @Column(name = "c_username")
    private String username;

    /**
     * ����
     */
    @Column(name = "c_name")
    private String name;

    /**
     * ����ǩ��
     */
    @Column(name = "c_perSign")
    private String persign;

    /**
     * ͷ��·��
     */
    @Column(name = "c_headImg")
    private String headimg;

    /**
     * ����
     */
    @Column(name = "c_password")
    private String password;

    /**
     * ѧУ
     */
    @Column(name = "c_school")
    private String school;

    /**
     * ѧ��
     */
    @Column(name = "c_stuid")
    private String stuid;

    /**
     * ����
     */
    @Column(name = "c_email")
    private String email;

    /**
     * �ֻ���
     */
    @Column(name = "c_telpthone")
    private String telpthone;

    /**
     * ɾ�����
     */
    @Column(name = "c_del")
    private Boolean del;

    /**
     * ��ȡ����id
     *
     * @return c_id - ����id
     */
    public Integer getId() {
        return id;
    }

    /**
     * ��������id
     *
     * @param id ����id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ�û���
     *
     * @return c_username - �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �����û���
     *
     * @param username �û���
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ����
     *
     * @return c_name - ����
     */
    public String getName() {
        return name;
    }

    /**
     * ��������
     *
     * @param name ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ����ǩ��
     *
     * @return c_perSign - ����ǩ��
     */
    public String getPersign() {
        return persign;
    }

    /**
     * ���ø���ǩ��
     *
     * @param persign ����ǩ��
     */
    public void setPersign(String persign) {
        this.persign = persign;
    }

    /**
     * ��ȡͷ��·��
     *
     * @return c_headImg - ͷ��·��
     */
    public String getHeadimg() {
        return headimg;
    }

    /**
     * ����ͷ��·��
     *
     * @param headimg ͷ��·��
     */
    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    /**
     * ��ȡ����
     *
     * @return c_password - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡѧУ
     *
     * @return c_school - ѧУ
     */
    public String getSchool() {
        return school;
    }

    /**
     * ����ѧУ
     *
     * @param school ѧУ
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * ��ȡѧ��
     *
     * @return c_stuid - ѧ��
     */
    public String getStuid() {
        return stuid;
    }

    /**
     * ����ѧ��
     *
     * @param stuid ѧ��
     */
    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    /**
     * ��ȡ����
     *
     * @return c_email - ����
     */
    public String getEmail() {
        return email;
    }

    /**
     * ��������
     *
     * @param email ����
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ�ֻ���
     *
     * @return c_telpthone - �ֻ���
     */
    public String getTelpthone() {
        return telpthone;
    }

    /**
     * �����ֻ���
     *
     * @param telpthone �ֻ���
     */
    public void setTelpthone(String telpthone) {
        this.telpthone = telpthone;
    }

    /**
     * ��ȡɾ�����
     *
     * @return c_del - ɾ�����
     */
    public Boolean getDel() {
        return del;
    }

    /**
     * ����ɾ�����
     *
     * @param del ɾ�����
     */
    public void setDel(Boolean del) {
        this.del = del;
    }
}