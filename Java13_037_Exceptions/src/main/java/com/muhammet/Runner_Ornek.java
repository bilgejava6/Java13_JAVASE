package com.muhammet;

import java.util.List;
import java.util.Scanner;

public class Runner_Ornek {
    public static void main(String[] args) {
        System.out.println("""
                    *********************************
                    ******** Okul Otomasyonu ********
                    *********************************
                    
                    1- Öğrenci İşlemleri
                    2- Öğretmen İşlemleri
                    3- Sınıf İşlemleri
                    4- Ders İşlemleri
                    0- Çıkış
                """);
        System.out.print("Seçim yapınız.......: ");
        switch (secimYap(0,7)){
            case 0 :
                System.out.println("ÇIKIŞ YAPILDI"); break;
            case 1 : ogrenciIslmeleri(); break;
            case 2: System.out.println("Öğretmen İşlemleri"); break;
            default: System.out.println("Hatalı seçim yaptınız"); break;
        }

        List<String> isimler = List.of("ahmet","mehmet","ali","veli");


        System.out.println("UYGULAMA KAPANDI");
    }

    private static void ogrenciIslmeleri(){

    }
    private static int secimYapHata(){
        int secim = new Scanner(System.in).nextInt();
        return secim;
    }

    private static int secimYap(int start, int end){
        /**
         * hedef: 0 ile 4 dahil sayılar arasında seçim yapılmasını sağlamak
         *
         */
        int secim = 0;
        boolean isRepeat =false;
        do{
            try{
                secim = new Scanner(System.in).nextInt();
                if(secim< start || secim > end){
                    System.out.print("Lütfen ["+start+"-"+end+"] arasında bir değer giriniz....: ");
                    isRepeat = true;
                }else
                    isRepeat = false;
            }catch (Exception e){
                System.out.print("Lütfen sayısal bir değer girerek tekrar deneyiniz.......: ");
                isRepeat = true;
            }
        }while (isRepeat);
          return secim;
    }
}
