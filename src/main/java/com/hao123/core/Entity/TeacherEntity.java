package com.hao123.core.Entity;

import com.alibaba.excel.annotation.ExcelProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * @author cvbnt
 */
@Entity
@Table(name = "teacher", schema = "database")
public class TeacherEntity {
    @ExcelProperty("id")
    private int id;
    @ExcelProperty("学校编号")
    private int schoolId;
    @ExcelProperty("教师编号")
    private String teacherCode;
    @ExcelProperty("头像")
    private String avatar;
    @ExcelProperty("姓名")
    private String name;
    @ExcelProperty("性别")
    private String sex;
    @ExcelProperty("职级")
    private String title;
    @ExcelProperty("学科")
    private String subject;
    @ExcelProperty("手机号码")
    private String phone;
    @ExcelProperty("执教开始日期")
    private Date startTeachDate;
    @ExcelProperty("创建时间")
    private Date createAt;
    @ExcelProperty("更新时间")
    private Date updateAt;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "schoolId")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "teacherCode")
    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "startTeachDate")
    public Date getStartTeachDate() {
        return startTeachDate;
    }

    public void setStartTeachDate(Date startTeachDate) {
        this.startTeachDate = startTeachDate;
    }

    @Basic
    @Column(name = "createAt")
    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Basic
    @Column(name = "updateAt")
    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TeacherEntity that = (TeacherEntity) o;
        return id == that.id && schoolId == that.schoolId && Objects.equals(teacherCode, that.teacherCode) && Objects.equals(avatar, that.avatar) && Objects.equals(name, that.name) && Objects.equals(sex, that.sex) && Objects.equals(title, that.title) && Objects.equals(subject, that.subject) && Objects.equals(phone, that.phone) && Objects.equals(startTeachDate, that.startTeachDate) && Objects.equals(createAt, that.createAt) && Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, schoolId, teacherCode, avatar, name, sex, title, subject, phone, startTeachDate, createAt, updateAt);
    }

    @Override
    public String toString() {
        return "TeacherEntity{" +
                "id=" + id +
                ", schoolId=" + schoolId +
                ", teacherCode='" + teacherCode + '\'' +
                ", avatar='" + avatar + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", phone='" + phone + '\'' +
                ", startTeachDate=" + startTeachDate +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }


    public TeacherEntity(Integer id, Integer schoolId, String teacherCode, String avatar, String name, String sex, String title, String subject, String phone, Timestamp startTeachDate, Timestamp createAt, Timestamp updateAt) {
        this.id = id;
        this.schoolId = schoolId;
        this.teacherCode = teacherCode;
        this.avatar = avatar;
        this.name = name;
        this.sex = sex;
        this.title = title;
        this.subject = subject;
        this.phone = phone;
        this.startTeachDate = startTeachDate;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public TeacherEntity() {
    }
}
