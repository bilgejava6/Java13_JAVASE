package com.muhammet.controller;

import com.muhammet.entity.User;
import com.muhammet.service.UserService;

import java.util.Optional;
import java.util.Scanner;

public class UserController {

    private UserService userService;
    public UserController(){
        userService = new UserService();
    }

    public void uyeOl(){
        System.out.println("**************************");
        System.out.println("****** ÜYE OL ************");
        System.out.println("**************************");
        System.out.print("Kullanıcı adı....:  ");
        String kullaniciAdi = new Scanner(System.in).nextLine();
        System.out.print("Şifre..........: ");
        String sifre = new Scanner(System.in).nextLine();
        System.out.print("Adınız.........: ");
        String ad = new Scanner(System.in).nextLine();
        User user = new User(kullaniciAdi,sifre,ad);
        if(userService.save(user))
            System.out.println("Kullanıcı kayıt edildi.");
        else
            System.out.println("Bu kullanıcı adı daha önce alınmış.");
    }

    public User girisYap(){
        System.out.println("**************************");
        System.out.println("****** GİRİŞ YAP**********");
        System.out.println("**************************");
        System.out.print("Kullanıcı adı....:  ");
        String kullaniciAdi = new Scanner(System.in).nextLine();
        System.out.print("Şifre..........: ");
        String sifre = new Scanner(System.in).nextLine();
        Optional<User> user = userService.findByUserNameAndPassword(kullaniciAdi,sifre);
        if(user.isEmpty()){
            System.err.println("Kullanıcı adı veya şifre hatalı.");
            return null;
        }else {
            return user.get();
        }
    }

    public void kullanicilariListe(){
        System.out.println("**************************");
        System.out.println("****** KULLANICILAR ******");
        System.out.println("**************************");
        userService.findAll().forEach(System.out::println);
    }

}
