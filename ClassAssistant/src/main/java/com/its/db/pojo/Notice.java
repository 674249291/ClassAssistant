package com.its.db.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_notice")
public class Notice {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ����
     */
    @Column(name = "c_title")
    private String title;

    /**
     * ����
     */
    @Column(name = "c_content")
    private String content;

    /**
     * ����ʱ��
     */
    @Column(name = "c_releaseDate")
    private Date releasedate;

    /**
     * �����ˣ���ʦ��
     */
    @Column(name = "c_teacherName")
    private String teachername;

    /**
     * ����id
     */
    @Column(name = "c_classroomId")
    private Integer classroomid;

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
     * ��ȡ����
     *
     * @return c_title - ����
     */
    public String getTitle() {
        return title;
    }

    /**
     * ���ñ���
     *
     * @param title ����
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ����
     *
     * @return c_content - ����
     */
    public String getContent() {
        return content;
    }

    /**
     * ��������
     *
     * @param content ����
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return c_releaseDate - ����ʱ��
     */
    public Date getReleasedate() {
        return releasedate;
    }

    /**
     * ���÷���ʱ��
     *
     * @param releasedate ����ʱ��
     */
    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    /**
     * ��ȡ�����ˣ���ʦ��
     *
     * @return c_teacherName - �����ˣ���ʦ��
     */
    public String getTeachername() {
        return teachername;
    }

    /**
     * ���÷����ˣ���ʦ��
     *
     * @param teachername �����ˣ���ʦ��
     */
    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    /**
     * ��ȡ����id
     *
     * @return c_classroomId - ����id
     */
    public Integer getClassroomid() {
        return classroomid;
    }

    /**
     * ���ÿ���id
     *
     * @param classroomid ����id
     */
    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    /**
     * @return c_del
     */
    public Boolean getDel() {
        return del;
    }

    /**
     * @param del
     */
    public void setDel(Boolean del) {
        this.del = del;
    }
}