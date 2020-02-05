package com.po;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private Integer sid;
    private String sname;
    private String sex;
    private String address;
    private Date birthday;
    private Integer classid;
    private String cname;
    private String sdate;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", classid=" + classid +
                ", cname='" + cname + '\'' +
                ", sdate='" + sdate + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public Student(Integer sid, String sname, String sex, String address, Date birthday, Integer classid, String cname, String sdate) {

        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.address = address;
        this.birthday = birthday;
        this.classid = classid;
        this.cname = cname;
        this.sdate = sdate;
    }

    public Student() {

    }
}
