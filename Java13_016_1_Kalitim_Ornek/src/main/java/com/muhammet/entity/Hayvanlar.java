package com.muhammet.entity;

import java.util.Scanner;

public class Hayvanlar {
    // STATE - Özellikler - properties -> Değişken
    public String tur;
    public String ad;
    private long yasamSuresi; // gün olarak tutuluyor
    private long saat;// saat olarak tutuluyor
    public int yas;
    public boolean aclik; // hayvanın aç olup olmadığını tutan değişken
    public boolean asiliMi;
    public int agirlik;
    public int boy;
    /**
     * Hayvanın beslenme şekli
     * 1-> Etobur
     * 2-> Otobur
     *  genel tanımlama şekli - (yeşillik)
     */
    public String beslenmeSekli;
    /**
     * 1- UYUYOR
     * 2- UYANIK YATIYOR
     * 3- AYAKTA DURUYOR
     * 4- YÜRÜYOR
     * 5- KOŞUYOR
     * 6- DİNLENİYOR
     * 7- HIZLI YÜRÜME
     * 8- YÜZME
     * 9- UÇMA
     * 10- DİĞER
     */
    public String hareketDurumu;
    /**
     * HH -> her seferinde yemek yesin mi diye sor
     * EE -> bir daha yemek yedirmeyi sorma yedir.
     */
    private String defaultYedirme = "HH";

    // BEHAVIOR - Davranışlar - Fonksiyon - Aksiyonları -> methods

    public void yemekYe(){
        System.out.println("Hayvan yemek yedi");
        aclik = false;
    }

    /**
     * Hayvanın yemek yemesi, Eğer hayvan kendi beslenme türüne uyun şekilde belenemez ise,
     * yemek yemediğini ve aç kaldığını belirmek için false değeri dönülür.
     * @param yemekTuru
     * @return
     */
    public boolean yemekYe(String yemekTuru){
        if(beslenmeSekli.equalsIgnoreCase("Etobur")){ // etçil
            if(yemekTuru.contains("yeşil bitki")){
                aclik = true;
                return false;
            }else{
                aclik = false;
                return true;
            }
        }else{ // otçul
            if(yemekTuru.contains("yeşil bitki")){
                aclik = false;
                return true;
            }else {
                aclik = true;
                return false;
            }
        }
    }

    public void asiYaptir(){
        System.out.println("Hayvan aşısı yapıldı");
        asiliMi = true;
    }

    public void yaslandir(){
        yasamSuresi++;
        if(yasamSuresi%365==0){
            yas++;
            System.out.println("Doğum günün kutlu olsun yaşın bir arttı"+ yas + " yaşına girdin");
        }
    }

    public void birSaat(){
        saat++;
        if(saat==24){
            System.out.println("Bir gün geçti yeni güne hoşgeldin");
            yaslandir();
            saat = 0;
            // 1 gün sonunda kontrol edilmesi gereken herşey burada yapılabilir.
        }
        // durum ile ilgili kontroller yapılabilir. bunlar saatlik kontroller olabilir.
        acikmisMi();
    }

    public void acikmisMi(){
        if(saat%3==0 && defaultYedirme.equals("HH")){
            aclik = true;
            System.out.print("Yemek yedirmek istiyor musunuz?[E/H]...: ");
            String EH = new Scanner(System.in).nextLine();
            if(EH.equals("E"))
                yemekYe();
            else if (EH.equals("EE")) {
                defaultYedirme = "EE";
            }
        }else if (saat%3==0 && defaultYedirme.equals("EE")){
            yemekYe();
        }
    }
}
