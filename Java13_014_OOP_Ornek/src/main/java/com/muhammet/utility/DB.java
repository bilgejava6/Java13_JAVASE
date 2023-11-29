package com.muhammet.utility;

import com.muhammet.entity.Auth;
import com.muhammet.entity.UserProfile;

public class DB {
    private static int authCount = 0;
    private static int userCount = 0;

    public static Auth[] authList = new Auth[100];
    public static UserProfile[] userProfileList = new UserProfile[100];

    public static int getAuthIndex(){
        return authCount++;
    }

    public static int getUserIndex(){
        return userCount++;
    }
}
