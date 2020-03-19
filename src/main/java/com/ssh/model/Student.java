package com.ssh.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@IdClass(StudentPK.class)
public class Student {
    private int id;
    private String userNo;
    private String userName;
    private String password;
    private String userSex;
    private Timestamp userBirthday;
    private String userClass;
    private Timestamp dateCreate;
    private Timestamp dateUpdate;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "user_no", nullable = false, length = 20)
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "user_sex", nullable = false, length = 20)
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "user_birthday", nullable = true)
    public Timestamp getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Timestamp userBirthday) {
        this.userBirthday = userBirthday;
    }

    @Basic
    @Column(name = "user_class", nullable = true, length = 20)
    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    @Basic
    @Column(name = "date_create", nullable = false)
    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Basic
    @Column(name = "date_update", nullable = false)
    public Timestamp getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Timestamp dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(userNo, student.userNo) &&
                Objects.equals(userName, student.userName) &&
                Objects.equals(password, student.password) &&
                Objects.equals(userSex, student.userSex) &&
                Objects.equals(userBirthday, student.userBirthday) &&
                Objects.equals(userClass, student.userClass) &&
                Objects.equals(dateCreate, student.dateCreate) &&
                Objects.equals(dateUpdate, student.dateUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userNo, userName, password, userSex, userBirthday, userClass, dateCreate, dateUpdate);
    }
}
