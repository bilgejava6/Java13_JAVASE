package com.muhammet.repository;

import com.muhammet.entity.Auth;
import com.muhammet.entity.UserProfile;
import com.muhammet.utility.DB;

import java.util.UUID;

public class AuthRepository {

    public void register(String userName,String password,
                         String email,String name,String surname){
        Auth auth = new Auth();
        auth.userName = userName;
        auth.password = password;
        auth.id = UUID.randomUUID().toString();
        DB.authList[DB.getAuthIndex()] = auth;
        UserProfile userProfile = new UserProfile();
        userProfile.authId = auth.id;
        userProfile.email = email;
        userProfile.name = name;
        userProfile.surName = surname;
        DB.userProfileList[DB.getUserIndex()] = userProfile;

    }

    public boolean login(String userName,String password){
        return false;
    }
}
