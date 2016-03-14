package com.its.db.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_comments")
public class Comments {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ��������
     */
    @Column(name = "c_content")
    private String content;

    /**
     * ����������
     */
    @Column(name = "c_comPerType")
    private Integer compertype;

    /**
     * ������id
     */
    @Column(name = "c_comPerId")
    private Integer comperid;

    /**
     * ����������
     */
    @Column(name = "c_comPerName")
    private String compername;

    /**
     * ����ʱ��
     */
    @Column(name = "c_comPerDate")
    private Date comperdate;

    /**
     * ѧϰ��Դid
     */
    @Column(name = "c_studyResourceId")
    private Integer studyresourceid;

    /**
     * ��������ʱ��
     */
    @Column(name = "c_comPerLastDate")
    private Date comperlastdate;

    @Column(name = "c_del")
    private Byte del;

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
     * ��ȡ��������
     *
     * @return c_content - ��������
     */
    public String getContent() {
        return content;
    }

    /**
     * ������������
     *
     * @param content ��������
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * ��ȡ����������
     *
     * @return c_comPerType - ����������
     */
    public Integer getCompertype() {
        return compertype;
    }

    /**
     * ��������������
     *
     * @param compertype ����������
     */
    public void setCompertype(Integer compertype) {
        this.compertype = compertype;
    }

    /**
     * ��ȡ������id
     *
     * @return c_comPerId - ������id
     */
    public Integer getComperid() {
        return comperid;
    }

    /**
     * ����������id
     *
     * @param comperid ������id
     */
    public void setComperid(Integer comperid) {
        this.comperid = comperid;
    }

    /**
     * ��ȡ����������
     *
     * @return c_comPerName - ����������
     */
    public String getCompername() {
        return compername;
    }

    /**
     * ��������������
     *
     * @param compername ����������
     */
    public void setCompername(String compername) {
        this.compername = compername;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return c_comPerDate - ����ʱ��
     */
    public Date getComperdate() {
        return comperdate;
    }

    /**
     * ��������ʱ��
     *
     * @param comperdate ����ʱ��
     */
    public void setComperdate(Date comperdate) {
        this.comperdate = comperdate;
    }

    /**
     * ��ȡѧϰ��Դid
     *
     * @return c_studyResourceId - ѧϰ��Դid
     */
    public Integer getStudyresourceid() {
        return studyresourceid;
    }

    /**
     * ����ѧϰ��Դid
     *
     * @param studyresourceid ѧϰ��Դid
     */
    public void setStudyresourceid(Integer studyresourceid) {
        this.studyresourceid = studyresourceid;
    }

    /**
     * ��ȡ��������ʱ��
     *
     * @return c_comPerLastDate - ��������ʱ��
     */
    public Date getComperlastdate() {
        return comperlastdate;
    }

    /**
     * ������������ʱ��
     *
     * @param comperlastdate ��������ʱ��
     */
    public void setComperlastdate(Date comperlastdate) {
        this.comperlastdate = comperlastdate;
    }

    /**
     * @return c_del
     */
    public Byte getDel() {
        return del;
    }

    /**
     * @param del
     */
    public void setDel(Byte del) {
        this.del = del;
    }
}