package com.muhammet.checkedUnchecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class Runner {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("UYGULAMA BAŞLADI");
        /**
         * Satış-> Kullanıcı, Ürün, Satıcı, Ödeme, Kargo
         * 1- Ürün stoğu azalsın
         * 2- Satıcıya bilgi gitsin
         * 3- Satıcının ekranına ödeme bilgileri gelsin
         * 4- Kargo ekranına ürün ve adres bilgisi gitsin.
         * 5- işlem tamamlansın.
         * 6- Kullanıcıya mail gitsin.
         *
         * Checked Exception -> Denetlenen İstisnalar
         * denetlenen istisnaları 2. şekilde kontrol etmek zorundasınız.
         * - try.catch ile
         * - throws ile sizde bir üst methoda iletirsiniz.
         *
         */
        try{
            Thread.sleep(1000L);
        }catch(Exception exception){

        }

        Thread.sleep(1000L);

        try {
            int sayi = getIntCheckedException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        new FileReader(new File("dosya yolu"));
        int sonuc = bolme(3432,0);
        if(sonuc>0){

        }else {

        }
        System.out.println("UYGULAMA BİTTİ");
    }


    public static int bolme(int s1, int s2) throws  RuntimeException{
        if(s2==0) throw new RuntimeException("HATA, bölen sayı 0 olamaz");
        return s1/s2;
    }

    public static  int getIntCheckedException() throws Exception{
        return new Random().nextInt();
    }


}
