package com.muhammet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner_try {
    public static String ifade;
    private static Islemler islemler = new Islemler();
    private static String[] ifadeDizi = new String[]{"ali", "veli", "deli" };
    private static String dosyaYolu = "main/olmayan/bir/dosya/yolu";
    public static void main(String[] args) {
        System.out.println("UYGULAMA BAŞLADI.");
        //metinEkle();
        //islemler.BolmeIslemi(34,2);
//        System.out.println(ifade);
//        System.out.println(ifade.toUpperCase());
        Ifadeler ifadeler = new Ifadeler();
        Ifadeler.ifade = "Boş geçme";


        try{
            // Hata olması muhtemel kodlar buraya yazılır.

            System.out.println("Ürün Adedi....: ");
            int adet = new Scanner(System.in).nextInt();
            System.out.println("Ürün Adedi....: "+ adet);
            System.out.println(ifadeler.getUpperIfade());

        }catch (InputMismatchException exception){
            System.out.println("Lütfen Birim sayılarını Rakam olarak giriniz.");
        }catch (Exception exception){
            // hata oluşup bir istisnayakalanır ise burada işlemler yapılır.
            System.out.println("Hata oluştu. Hata detay...: "+ exception.getMessage());
        }


        System.out.println("UYGULAMA BİTTİ.");
    }

    private static void metinEkle(){
        ifade = "İçerik yazılmalı yoksa içerik olmaz (NULL olur)";
    }
}
