package com.muhammet.controller;

import com.muhammet.utility.Constants;

import java.util.Scanner;


public class MainController {
    private PostController postController;
    public MainController(){
        postController = new PostController();
    }
    public void homePage(){
        System.out.println("**********************************");
        System.out.println("***** Hoşgeldin "+ Constants.loginUser.getUsername()+"     ***");
        System.out.println(
                """                     
                **********************************
                ** 1- Postları görüntüle
                ** 2- Post Paylaş
                ** 3- Kullanıcıları Görüntüle
                ** 4- Logout(Sistemden Çıkış yap login ekranına dön)
                  
                """
        );
        System.out.print("Lütfen seçim yapınız....: ");
        int secim = new Scanner(System.in).nextInt();
        switch(secim){
            case 1: postController.getAllPosts(); break;
            case 2: postController.creteNewPost(); break;
            case 3: break;
            default: break;
        }
    }
}
