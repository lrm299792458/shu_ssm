package cn.shu.domain;

import java.io.Serializable;
import java.util.Date;

/**
* @Description: 学生实体类
* @Author: zca
* @Date: 2022/1/23
*/
public class Student implements Serializable {
    private String sid;//学号
    private String name;//姓名
    private Integer age;//年龄
    private String sex;//性别
    private String grade;//年级
    private String xy;//学院
    private String phone;//手机号
    private String mail;//邮箱
    private String address;//家庭住址
    private String idnum;//身份证号
    private Date rw;//入伍时间
    private Date tw;//退伍时间
    private String fyd;//服役地
    private String state;//状态

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getXy() {
        return xy;
    }

    public void setXy(String xy) {
        this.xy = xy;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public Date getRw() {
        return rw;
    }

    public void setRw(Date rw) {
        this.rw = rw;
    }

    public Date getTw() {
        return tw;
    }

    public void setTw(Date tw) {
        this.tw = tw;
    }

    public String getFyd() {
        return fyd;
    }

    public void setFyd(String fyd) {
        this.fyd = fyd;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", xy='" + xy + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", idnum='" + idnum + '\'' +
                ", rw=" + rw +
                ", tw=" + tw +
                ", fyd='" + fyd + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
