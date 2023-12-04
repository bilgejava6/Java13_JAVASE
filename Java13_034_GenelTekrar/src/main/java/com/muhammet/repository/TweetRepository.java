package com.muhammet.repository;

import com.muhammet.entity.Tweet;

import java.util.List;

import static com.muhammet.utility.DB.TWEETLIST;

public class TweetRepository {

    public void save(Tweet tweet){
        TWEETLIST.add(tweet);
    }

    public List<Tweet> findAll(){
        return TWEETLIST;
    }

    public List<Tweet> findAllByUserId(String userId){
        return TWEETLIST.stream().filter(t-> t.getUserUuid().equals(userId)).toList();
    }
}
