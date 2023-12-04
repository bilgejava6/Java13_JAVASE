package com.muhammet.controller;

import com.muhammet.dto.TweetDto;
import com.muhammet.service.TweetService;

import java.util.List;
import java.util.Scanner;

public class TweetController {
    private TweetService tweetService;
    public TweetController(){
        tweetService = new TweetService();
    }

    public void tweetAt(String userId){
        System.out.println("""
                    *****************************
                    ******* TWEET PAYLAŞ ********
                    *****************************
                """);
        System.out.println("Lütfen tweet metnini giriniz....: ");
        String metin = new Scanner(System.in).nextLine();
        System.out.println("fotoğraf paylaş(Opsiyonel [.] )......: ");
        String mediaUrl = new Scanner(System.in).nextLine();
        tweetService.tweetAt(metin,userId,mediaUrl);
    }

    public void tweetleriGoruntule(){
        ekranaYaz(tweetService.findAll());
    }

    public void tweetGoruntuleKullaniciId(String userId){
        ekranaYaz(tweetService.findAllByUserId(userId));
    }

    private void ekranaYaz(List<TweetDto> dtoList){
        System.out.println("""
                    ****** TÜM TWEETLER ******
                """);
        dtoList.forEach(t->{
            System.out.println("""
                    kullanıcı   :"""+t.getUserName()+ """
                                         
                    tweet       :"""+t.getTweet()+"""
                    
                    tarih       :"""+t.getDate()+"""
                    
                    beğeni      :"""+t.getLikeCount()+"""
                    
                    retweet     :"""+t.getRetweetCount()+"""
                    
                    ----------------------------------------------------
                    """);
        });
    }
}
