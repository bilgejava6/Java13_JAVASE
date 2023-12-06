package com.muhammet;

public class Runner {
    public static void main(String[] args) {
        /**
         * Exceptions - İstisnalar ve Hata Yönetimi
         * --- Java da oluşabilecek hataları inceleyelim.
         * Java da çalışma zamanında(RunTime) oluşan istisnaları inceliyor olacağız. Burada dikkat edilmesi gerekenler,
         * 1- Oluşan hata mesajlarında hatanın en başına gidiniz.
         * 2- Hata mesajını bulup okuyunuz, hatanın yaşandığı satır özellikle belirtilir.
         * 3- İstisna türünü inceleyip neden oluştuğunu anlamaya çalışın.
         */
        System.out.println("Hello World!");
      //  OlmayanBirSinif olmayanBirSinif = new OlmayanBirSinif();
        int bolum = 5;
        int bolen = 0;
        Islemler islemler = new Islemler();
        int sonuc =islemler.BolmeIslemi(bolum, bolen);
        System.out.println("Bölme İşlemi Sonuc: "+sonuc);
    }

}
