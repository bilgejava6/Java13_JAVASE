package com.muhammet;

import java.util.Objects;

public class Runner_Ornek1 {
    public static String ifade;
    private static Islemler islemler = new Islemler();
    private static String[] ifadeDizi = new String[]{"ali", "veli", "deli" };

    public static void main(String[] args) {

        try{
            ifade = "JavaSE";
            System.out.println("ifade...: "+ ifade.toUpperCase());
            ifadeDizi[2] = "mehmet";
            Object nesne = "3";
            String ifadeSayi = (String) nesne; // cast işlemi
            long sayi = (int) nesne;
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("HATA!, Dizi boyutu aşıldı.");
        }catch (NullPointerException exception){
            System.out.println("HATA!, ifade değişkeni NULL olduğu için hata oluştu.");
        }catch (Exception exception){
            System.out.println("HATA!, Beklenmeyen bir durum oluştur lütfen 0000 numarayı arayın ...: "+ exception.getMessage());
        }
    }
}
