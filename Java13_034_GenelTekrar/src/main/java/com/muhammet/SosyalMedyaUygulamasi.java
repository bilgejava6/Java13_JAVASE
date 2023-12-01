package com.muhammet;

import com.muhammet.entity.User;
import com.muhammet.service.UserService;

import java.util.Scanner;

public class SosyalMedyaUygulamasi {
    private static UserService userService = new UserService();
    private static User loginUser = null;
    public static void main(String[] args) {
        int secim;
        do{
            if(loginUser!=null)
                System.out.println("Hoşgeldin "+loginUser.getName());
            System.out.println("""
                        Sosyal Medya Uygulaması
                                TWEET
                        1. Giriş Yap
                        2. Kayıt Ol
                        3. Tweet At
                        4. Tweetleri Görüntüle
                        5. Kullanici Listesi
                        6. Kişi Ara    
                        7. Profilim                    
                        0. Çıkış Yap
                """);
            System.out.print("Seçiminiz....: ");
            secim = new Scanner(System.in).nextInt();
            switch (secim){
                case 1: loginUser = userService.girisYap(); break;
                case 2: userService.uyeOl(); break;
                case 3: break;
                case 4: break;
                case 5: userService.kullanicilariListe(); break;
                case 6: break;
                case 0:
                    System.err.println("ÇIKIŞ YAPILDI."); break;
                default:
                    System.out.println("Yanlış seçim yaptınız.");
            }
        }while (secim != 0);



    }
}
