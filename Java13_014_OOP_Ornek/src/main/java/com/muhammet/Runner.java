package com.muhammet;

import com.muhammet.repository.AuthRepository;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        System.out.println("****************************");
        System.out.println("****     INSTAGRAM       ***");
        System.out.println("****************************");
        System.out.println("Login");
        System.out.println("Register");
        System.out.println();
        System.out.print("seçiniz.....: ");
        String secim = new Scanner(System.in).nextLine();
        switch (secim){
            case "Login": doLogin();break;
            case "Register": register();break;
            default: break;
        }

    }//main sonu

    private static void doLogin(){

    }

    private static void register(){
        System.out.print("Kullanıcı adı....: ");
        String userName = new Scanner(System.in).nextLine();
        System.out.print("Şifre............: ");
        String password = new Scanner(System.in).nextLine();
        System.out.print("email............: ");
        String email = new Scanner(System.in).nextLine();
        System.out.print("ad...............: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("soyad............: ");
        String surname = new Scanner(System.in).nextLine();
        AuthRepository repository = new AuthRepository();
        repository.register(userName,password,email,name,surname);
    }


}//class sonu
