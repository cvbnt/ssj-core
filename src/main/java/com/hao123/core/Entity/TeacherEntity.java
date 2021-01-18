package com.hao123.core.Entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.hao123.core.Entity.ExcelData.TeacherData;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author cvbnt
 */
@Entity
@Table(name = "teacher", schema = "database")
public class TeacherEntity extends TeacherData {
    private int id;
    private int schoolId;
    private String teacherCode;
    private String avatar;
    private String name;
    private String sex;
    private String title;
    private String subject;
    private String phone;
    private Timestamp startTeachDate;
    private Timestamp createAt;
    private Timestamp updateAt;

    @Override
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    @Basic
    @Column(name = "schoolId")
    public int getSchoolId() {
        return schoolId;
    }

    @Override
    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    @Basic
    @Column(name = "teacherCode")
    public String getTeacherCode() {
        return teacherCode;
    }

    @Override
    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Override
    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    @Override
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    @Basic
    @Column(name = "startTeachDate")
    public Timestamp getStartTeachDate() {
        return startTeachDate;
    }

    public void setStartTeachDate(Timestamp startTeachDate) {
        this.startTeachDate = startTeachDate;
    }

    @Override
    @Basic
    @Column(name = "createAt")
    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    @Override
    @Basic
    @Column(name = "updateAt")
    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
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
