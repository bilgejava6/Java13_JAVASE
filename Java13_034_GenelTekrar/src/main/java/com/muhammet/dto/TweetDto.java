package com.muhammet.dto;

public class TweetDto {
    String tweet;
    String userName;
    String date;
    int likeCount;
    int retweetCount;

    public String getTweet() {
        return tweet;
    }

    public String getUserName() {
        return userName;
    }

    public String getDate() {
        return date;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public TweetDto(String tweet, String userName, String date, int likeCount, int retweetCount) {
        this.tweet = tweet;
        this.userName = userName;
        this.date = date;
        this.likeCount = likeCount;
        this.retweetCount = retweetCount;
    }
}
