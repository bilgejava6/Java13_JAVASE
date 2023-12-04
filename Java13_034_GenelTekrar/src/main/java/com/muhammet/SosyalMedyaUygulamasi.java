package com.muhammet;

import com.muhammet.controller.TweetController;
import com.muhammet.controller.UserController;
import com.muhammet.entity.User;
import com.muhammet.repository.UserRepository;
import com.muhammet.service.UserService;

import java.util.Scanner;

public class SosyalMedyaUygulamasi {
    /**
     * Mobil App
     * -> url istek atarak verileri alır. ya da gönderir.
     */
    private static UserController userController = new UserController();
    private static TweetController tweetController = new TweetController();

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
                        7. Benim Tweetlerim                    
                        0. Çıkış Yap
                """);
            System.out.print("Seçiminiz....: ");
            secim = new Scanner(System.in).nextInt();
            switch (secim){
                case 1: loginUser = userController.girisYap(); break;
                case 2: userController.uyeOl(); break;
                case 3: tweetController.tweetAt(loginUser.getUuid()); break;
                case 4: tweetController.tweetleriGoruntule(); break;
                case 5: userController.kullanicilariListe(); break;
                case 6: break;
                case 7: tweetController.tweetGoruntuleKullaniciId(loginUser.getUuid()); break;
                case 0:
                    System.err.println("ÇIKIŞ YAPILDI."); break;
                default:
                    System.out.println("Yanlış seçim yaptınız.");
            }
        }while (secim != 0);

    }
}
