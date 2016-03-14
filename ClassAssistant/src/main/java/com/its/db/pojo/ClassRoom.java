package com.its.db.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_classroom")
public class ClassRoom {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ������
     */
    @Column(name = "c_uuid")
    private String uuid;

    /**
     * ��������
     */
    @Column(name = "c_name")
    private String name;

    /**
     * ��������
     */
    @Column(name = "c_description")
    private String description;

    /**
     * ��������
     */
    @Column(name = "c_stuNum")
    private Integer stunum;

    /**
     * ��ʦid
     */
    @Column(name = "c_teacherId")
    private Integer teacherid;

    /**
     * ����������
     */
    @Column(name = "c_createrName")
    private String creatername;

    /**
     * ����ʱ��
     */
    @Column(name = "c_createrDate")
    private Date createrdate;

    /**
     * ɾ�����
     */
    @Column(name = "c_del")
    private Boolean del;

    /**
     * @return c_id
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
     * ��ȡ������
     *
     * @return c_uuid - ������
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * ����������
     *
     * @param uuid ������
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * ��ȡ��������
     *
     * @return c_name - ��������
     */
    public String getName() {
        return name;
    }

    /**
     * ���ÿ�������
     *
     * @param name ��������
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ��������
     *
     * @return c_description - ��������
     */
    public String getDescription() {
        return description;
    }

    /**
     * ���ÿ�������
     *
     * @param description ��������
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * ��ȡ��������
     *
     * @return c_stuNum - ��������
     */
    public Integer getStunum() {
        return stunum;
    }

    /**
     * ���ÿ�������
     *
     * @param stunum ��������
     */
    public void setStunum(Integer stunum) {
        this.stunum = stunum;
    }

    /**
     * ��ȡ��ʦid
     *
     * @return c_teacherId - ��ʦid
     */
    public Integer getTeacherid() {
        return teacherid;
    }

    /**
     * ���ý�ʦid
     *
     * @param teacherid ��ʦid
     */
    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    /**
     * ��ȡ����������
     *
     * @return c_createrName - ����������
     */
    public String getCreatername() {
        return creatername;
    }

    /**
     * ���ô���������
     *
     * @param creatername ����������
     */
    public void setCreatername(String creatername) {
        this.creatername = creatername;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return c_createrDate - ����ʱ��
     */
    public Date getCreaterdate() {
        return createrdate;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createrdate ����ʱ��
     */
    public void setCreaterdate(Date createrdate) {
        this.createrdate = createrdate;
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