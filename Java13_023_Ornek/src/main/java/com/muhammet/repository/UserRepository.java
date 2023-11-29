package com.muhammet.repository;

import com.muhammet.entity.User;

public class UserRepository {
    private static User[] userList = new User[100];
    private static int userCount = 0;

    public void register(String userName, String password){
//        User user = new User();
//        user.setUserName(userName);
//        user.setPassword(password);
//        userList[userCount] = user;
//        userCount++;

//        User user = new User(userName,password);
//        userList[userCount++] = user;
//
//        int s1 = 5, s2= 45;
//        int toplam = s1+s2;
//        toplam = 5+45;
        // System.currentTimeMillis() -> içinde bulunduğumuz anın milisaniye cinsinden değerini Long olarak döner.
        userList[userCount++] = new User(userName,password,System.currentTimeMillis());

    }

    public void findAll(){

    }

    public void findById(String id){

    }
}
