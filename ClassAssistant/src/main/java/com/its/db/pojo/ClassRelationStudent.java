package com.its.db.pojo;

import javax.persistence.*;

@Table(name = "t_classroom_relation_student")
public class ClassRelationStudent {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ����id
     */
    @Column(name = "c_classroomId")
    private Integer classroomid;

    /**
     * ѧ��id
     */
    @Column(name = "c_studentId")
    private Integer studentid;

    /**
     * ѧ����Ƭ
     */
    @Column(name = "c_stuCard")
    private String stucard;

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
     * ��ȡѧ��id
     *
     * @return c_studentId - ѧ��id
     */
    public Integer getStudentid() {
        return studentid;
    }

    /**
     * ����ѧ��id
     *
     * @param studentid ѧ��id
     */
    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    /**
     * ��ȡѧ����Ƭ
     *
     * @return c_stuCard - ѧ����Ƭ
     */
    public String getStucard() {
        return stucard;
    }

    /**
     * ����ѧ����Ƭ
     *
     * @param stucard ѧ����Ƭ
     */
    public void setStucard(String stucard) {
        this.stucard = stucard;
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