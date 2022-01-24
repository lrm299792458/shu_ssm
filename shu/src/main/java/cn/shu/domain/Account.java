package cn.shu.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private String num;
    private String  pwd;
    private Integer type;
    private String state;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Account{" +
                "num='" + num + '\'' +
                ", pwd='" + pwd + '\'' +
                ", type=" + type +
                ", state='" + state + '\'' +
                '}';
    }
}
