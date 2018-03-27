package com.webbookmall.domain;

/**
 * 该类属于user类的子类,用来存储用户的一些个人数据
 */
public class UserData {
    private String userName;
    private int sex;
    private int age;
    private String email;


    @Override
    public String toString() {
        return "UserData{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
