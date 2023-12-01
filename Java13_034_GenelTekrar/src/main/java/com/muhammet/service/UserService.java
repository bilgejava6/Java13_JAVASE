package com.muhammet.service;

import com.muhammet.entity.User;
import com.muhammet.repository.UserRepository;

import java.util.Optional;
import java.util.Scanner;

public class UserService {
    private UserRepository repository;
    public UserService(){
        repository = new UserRepository();
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
        repository.save(user);
    }

    public User girisYap(){
        System.out.println("**************************");
        System.out.println("****** GİRİŞ YAP**********");
        System.out.println("**************************");
        System.out.print("Kullanıcı adı....:  ");
        String kullaniciAdi = new Scanner(System.in).nextLine();
        System.out.print("Şifre..........: ");
        String sifre = new Scanner(System.in).nextLine();
        Optional<User> user = repository.findByUserNameAndPassword(kullaniciAdi,sifre);
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
        repository.findAll().forEach(System.out::println);
    }

}
