package com.muhammet.entity;

import java.util.Random;

public class Post {
    public Long id;
    public String userName;
    public String comment;
    public String postUrl;
    public Long sharedDate;

    /**
     * DİKKAT!!!!!
     * Eğer default constructor yazılmadan parametreli constructore
     * kullanılır ise, default constructor işlevini yitirir ve
     * erişime kapanır.
     */
    public Post(String pUserName,String pComment, String pPostUrl){
        id = new Random().nextLong(1,99999);
        userName = pUserName;
        comment = pComment;
        postUrl = pPostUrl;
        sharedDate = System.currentTimeMillis();
    }
}
