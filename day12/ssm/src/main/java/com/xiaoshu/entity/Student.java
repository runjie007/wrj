package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable {
    @Id
    private Integer sid;

    private String sname;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private Integer age;

    private String gender;

    private Integer ssid;

    private static final long serialVersionUID = 1L;

    /**
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * @return ssid
     */
    public Integer getSsid() {
        return ssid;
    }

    /**
     * @param ssid
     */
    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sname=").append(sname);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", ssid=").append(ssid);
        sb.append("]");
        return sb.toString();
    }
}