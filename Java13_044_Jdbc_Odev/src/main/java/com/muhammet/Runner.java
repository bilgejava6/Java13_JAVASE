package com.muhammet;

import com.muhammet.controller.UserController;

import java.util.Scanner;

public class Runner {

    /**
     * Buraya yazı ekliyorum.
     * ---> gişriş yapan kişinin bilgilerini bir yerde tutacaksınız.
     * ---> Yeni Ana Ekran
     * **********************************
     * ***** Hoşgeldin [muhammet hoca] **
     * **********************************
     * ** 1- Postları görüntüle
     * ** 2- Post Paylaş
     * ** 3- Kullanıcıları Görüntüle
     * ** 4- Logout(Sistemden Çıkış yap login ekranına dön)
     * -------------------
     *
     * **********************************
     * *** POST LİSTESİ *****************
     * **********************************
     *
     * * * * * * * * * * * * * * * * * *
     * *         Muhammet HOCA         *
     * * bugün java öğenmek için güzel *
     * * bir gün                       *
     * *                    29.12.2023 *
     * * * * * * * * * * * * * * * * * *
     *
     */

    public static void main(String[] args) {
        int secim;
        do{
            System.out.println("""
                
                     * ******************************
                     * ***** Java Forum Sayfası *****
                     * ********* GİRİŞ  *************
                     * 1- Login
                     * 2- Register
                     * 0- Ç I K I Ş
                
                """);
            System.out.print("lütfen seçiniz.......: ");
            secim = new Scanner(System.in).nextInt();
            switch (secim){
                case 1: new UserController().Login(); break;
                case 2: new UserController().Register(); break;
                default:
                    System.err.println("Lütfen geçerli bir seçim yapınız"); break;

            }
        }while (secim!=0);


        System.out.println("ÇIKIŞ");
    }
}
