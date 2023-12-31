package com.muhammet.entity;

import java.util.UUID;

public class User extends BaseEntity{
    String id;
    String userName;
    String password;

    public User() {
        id = UUID.randomUUID().toString();
    }

    public User(String userName, String password) {
        this();
        this.userName = userName;
        this.password = password;
    }

    public User(String userName,String password, Long createAt){
        this(userName,password);
        this.crateAt = createAt;
        this.updateAt = createAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
