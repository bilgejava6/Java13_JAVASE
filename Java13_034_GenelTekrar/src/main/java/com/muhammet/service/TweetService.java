package com.muhammet.service;

import com.muhammet.dto.TweetDto;
import com.muhammet.entity.Tweet;
import com.muhammet.entity.User;
import com.muhammet.repository.TweetRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TweetService {
    private TweetRepository repository;
    private UserService userService;
    public TweetService(){
        repository = new TweetRepository();
        userService = new UserService();
    }

    public void tweetAt(String metin,
                        String userId,
                        String mediaUrl){
        Tweet tweet = new Tweet();
        tweet.setTweet(metin);
        tweet.setUserUuid(userId);
        tweet.setMediaUrl(mediaUrl);
        repository.save(tweet);
    }

    public List<TweetDto> findAll(){
        /**
         * Elimizde olan, yani istiflediğimiz tweet lerin listesini çektik.
         */
        List<Tweet> tweetList = repository.findAll();
        /**
         * sonuç olarak dönmek istediğim tweet listesi. DataTransferObject(DTO)
         */
        //        List<TweetDto> result = new ArrayList<>();
        //        tweetList.forEach(t->{
        //            User user = userService.findById(t.getUserUuid());
        //            TweetDto dto = new TweetDto(t.getTweet(),user.getUserName(),new Date(t.getDate()).toString(),t.getLikeCount(),t.getRetweetCount());
        //            result.add(dto);
        //        });
        //        return result;
        return convertFromTweet(tweetList);
    }

    public List<TweetDto> findAllByUserId(String userId){
    //        List<Tweet> tweetList = repository.findAllByUserId(userId);
    //        List<TweetDto> result = new ArrayList<>();
    //        tweetList.forEach(t->{
    //            User user = userService.findById(t.getUserUuid());
    //            TweetDto dto = new TweetDto(t.getTweet(),user.getUserName(),new Date(t.getDate()).toString(),t.getLikeCount(),t.getRetweetCount());
    //            result.add(dto);
    //        });
    //        return result;
        return convertFromTweet(repository.findAllByUserId(userId));
    }

    private List<TweetDto> convertFromTweet(List<Tweet> tweetList){
        List<TweetDto> result = new ArrayList<>();
        tweetList.forEach(t->{
            User user = userService.findById(t.getUserUuid());
            TweetDto dto = new TweetDto(t.getTweet(),user.getUserName(),new Date(t.getDate()).toString(),t.getLikeCount(),t.getRetweetCount());
            result.add(dto);
        });
        return result;
    }
}
