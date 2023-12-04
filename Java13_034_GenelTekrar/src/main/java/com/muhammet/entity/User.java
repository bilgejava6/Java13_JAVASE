package com.muhammet.entity;

import com.muhammet.utility.UserStatus;

import java.util.UUID;

public class User {
    String uuid;
    String userName;
    String password;
    String name;
    Long memberDate;
    UserStatus status;
    @Override
    public String toString() {
        return "User{" +
                "uuid='" + uuid + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", memberDate=" + memberDate +
                '}';
    }

    public User(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.uuid = UUID.randomUUID().toString();
        this.memberDate = System.currentTimeMillis();
    }

    public String getUuid() {
        return uuid;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMemberDate() {
        return memberDate;
    }

    public void setMemberDate(Long memberDate) {
        this.memberDate = memberDate;
    }
}
