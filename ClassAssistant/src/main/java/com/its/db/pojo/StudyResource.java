package com.its.db.pojo;

import javax.persistence.*;

@Table(name = "t_studyresource")
public class StudyResource {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * �ļ���
     */
    @Column(name = "c_fileName")
    private String filename;

    /**
     * �ļ�����
     */
    @Column(name = "c_description")
    private String description;

    /**
     * �ϴ�·��
     */
    @Column(name = "c_path")
    private String path;

    /**
     * �ϴ�������
     */
    @Column(name = "c_uploaderName")
    private String uploadername;

    /**
     * �ϴ���id
     */
    @Column(name = "c_uploaderId")
    private Integer uploaderid;

    /**
     * �ϴ�������
     */
    @Column(name = "c_uploaderType")
    private Integer uploadertype;

    /**
     * ���ش���
     */
    @Column(name = "c_downloadNum")
    private Integer downloadnum;

    /**
     * �޴���
     */
    @Column(name = "c_zan")
    private Integer zan;

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
     * ��ȡ�ļ���
     *
     * @return c_fileName - �ļ���
     */
    public String getFilename() {
        return filename;
    }

    /**
     * �����ļ���
     *
     * @param filename �ļ���
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * ��ȡ�ļ�����
     *
     * @return c_description - �ļ�����
     */
    public String getDescription() {
        return description;
    }

    /**
     * �����ļ�����
     *
     * @param description �ļ�����
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * ��ȡ�ϴ�·��
     *
     * @return c_path - �ϴ�·��
     */
    public String getPath() {
        return path;
    }

    /**
     * �����ϴ�·��
     *
     * @param path �ϴ�·��
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * ��ȡ�ϴ�������
     *
     * @return c_uploaderName - �ϴ�������
     */
    public String getUploadername() {
        return uploadername;
    }

    /**
     * �����ϴ�������
     *
     * @param uploadername �ϴ�������
     */
    public void setUploadername(String uploadername) {
        this.uploadername = uploadername;
    }

    /**
     * ��ȡ�ϴ���id
     *
     * @return c_uploaderId - �ϴ���id
     */
    public Integer getUploaderid() {
        return uploaderid;
    }

    /**
     * �����ϴ���id
     *
     * @param uploaderid �ϴ���id
     */
    public void setUploaderid(Integer uploaderid) {
        this.uploaderid = uploaderid;
    }

    /**
     * ��ȡ�ϴ�������
     *
     * @return c_uploaderType - �ϴ�������
     */
    public Integer getUploadertype() {
        return uploadertype;
    }

    /**
     * �����ϴ�������
     *
     * @param uploadertype �ϴ�������
     */
    public void setUploadertype(Integer uploadertype) {
        this.uploadertype = uploadertype;
    }

    /**
     * ��ȡ���ش���
     *
     * @return c_downloadNum - ���ش���
     */
    public Integer getDownloadnum() {
        return downloadnum;
    }

    /**
     * �������ش���
     *
     * @param downloadnum ���ش���
     */
    public void setDownloadnum(Integer downloadnum) {
        this.downloadnum = downloadnum;
    }

    /**
     * ��ȡ�޴���
     *
     * @return c_zan - �޴���
     */
    public Integer getZan() {
        return zan;
    }

    /**
     * �����޴���
     *
     * @param zan �޴���
     */
    public void setZan(Integer zan) {
        this.zan = zan;
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