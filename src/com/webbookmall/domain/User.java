package com.webbookmall.domain;

/**
 * 用户类,存储用户购买书籍时所必要的数据, 例如:金额....
 */
public class User {
    private int userId;
    private String user;
    private String password;
    private double money;
    private UserData userData;//用户的一些个人资料

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", userData=" + userData +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }
}
