package com.muhammet;

public class Runner_String_4 {
    public static void main(String[] args) {
        /**
         * Bir ifade içinde geçebilecek olan kelimeleri ararken sadece varlıklarını kontrol etmek için
         * kjullanabieceğimiz bir method.
         * contains(str) -> aradığınız ifade var mı? -> true/false
         */
        String ifade = "muhammet hoca bugün yeni bir konu anlatıyor.";
        boolean varMi = ifade.contains("muhammet");
        if(varMi)
            System.out.println("Aranılan kelime yazı içinde vardır");
        else
            System.out.println("yoktur.");

        /**
         *
         * String ifadelerin belli kurallara göre bölünmesi gerekebilir. bunun için string  içinde bunu yapabilerceğimniz<
         * bir method bulunmaktadır.
         * str.split(";")
         *
         */
        System.out.println();
        String ogrenciListesi = """
                001,Burcu;002,Deniz;003,Denizhan;004,Elif
                """;
        String[] ogrenciler = ogrenciListesi.split(";");
        /**
         * {"001,Burcu","002,Deniz","003,Denizhan","004,Elif"}
         */
        System.out.println("Öğrenci Listesi......: "+ogrenciListesi);

        for(int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        ifade = "bugün hava güneşli ve parlak, huzurlu bir gün olacak";
        String[] kelimeler = ifade.split(" ");

        for(String kelime: kelimeler)
            System.out.println(kelime);
    }
}
