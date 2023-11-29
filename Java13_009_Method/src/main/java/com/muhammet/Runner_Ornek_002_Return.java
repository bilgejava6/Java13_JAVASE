package com.muhammet;

public class Runner_Ornek_002_Return {
    public static void main(String[] args) {

        int yanit;

        yanit = soruyaCevapVer();
        System.out.println("yanıt........: "+ yanit);

        //System.out.println("yanıt.....: "+ soruyaCevapVer());

    }//main method sonu

    public static int soruyaCevapVer(){
        int s1=67,s2=556;
        int sonuc = s1+s2;
        //System.out.println("Sonuç....: "+ sonuc);
        /**
         * bir method un cevap vermesi return ile olur.
         * System.out.println() -> ile ekrana yazı yazdırmak bir geri dönüş yapmak değildir.
         */
        return sonuc;
    }
}//class sonu
