package com.muhammet.entity;

import java.util.UUID;

public class Tweet {
    String uuid;
    String tweet;
    String userUuid;
    Long date;
    String mediaUrl;
    int likeCount;
    int retweetCount;

    public Tweet(String tweet, String userUuid, String mediaUrl) {
        this();
        this.tweet = tweet;
        this.userUuid = userUuid;
        this.mediaUrl = mediaUrl;
    }

    public Tweet() {
        this.uuid = UUID.randomUUID().toString();
        this.date = System.currentTimeMillis();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(int retweetCount) {
        this.retweetCount = retweetCount;
    }
}
