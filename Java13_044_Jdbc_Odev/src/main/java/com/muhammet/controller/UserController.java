package com.muhammet.controller;

import com.muhammet.entity.User;
import com.muhammet.repository.UserRepository;
import com.muhammet.utility.Constants;

import java.util.Optional;
import java.util.Scanner;

public class UserController {
    private UserRepository userRepository;
    public UserController(){
        this.userRepository = new UserRepository();
    }
    public void Login(){
        System.out.println("""
                  *******************************
                  ****    KULLANICI GİRİŞ   *****
                  *******************************
                
                """);
        System.out.print("Kullanıcı adı.....: ");
        String username = new Scanner(System.in).nextLine();
        System.out.print("Şifre.............: ");
        String password = new Scanner(System.in).nextLine();
        Optional<User> userOptional = userRepository.doLogin(username,password);
        if(userOptional.isPresent()){
            Constants.loginUser = userOptional.get(); // giriş yapan kullanıcıyı tutuyoruz.
            System.out.println("GİRİŞ YAPILDI");
            new MainController().homePage();
        }else {
            System.out.println("Kullanıcı adı yada şifre hatalıdır.");
        }
    }

    public void Register(){
        System.out.println("""
                    *******************************
                    **** YENİ KULLANICI KAYDI *****
                    *******************************
                    
                """);
        System.out.print("ad soyad.........: ");
        String adsoyad = new Scanner(System.in).nextLine();

        String username;
        boolean isUser;
        do {
            System.out.print("Kullanıcı adı....: ");
            username = new Scanner(System.in).nextLine();
            isUser = userRepository.isUserName(username);
            if (isUser)
                System.err.println("Bu kullanıcı adı zaten kullanılıyor. lütfen değiştirin");
        }while (isUser);

        System.out.print("Şifre............: ");
        String password = new Scanner(System.in).nextLine();
        User user = new User(adsoyad,username,password,"");
        userRepository.save(user);
    }
}
