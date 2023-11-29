package com.muhammet;

public class Runner_Ornek_002_1_Return {
    public static void main(String[] args) {

        int fark;
        fark = soruyaCevapVer1() - soruyaCevapVer2();
        System.out.println("Yanıt.....: "+ fark);

    }//main sonu
    /**
     * iki farklı method yazıyorsunuz. bu methodlar kendi içlerinde 2 farklı sayınını çarpımını bulup
     * return ediyor olsun. bu iki method tan dönen sayıların farkını bulan kodu yazınız.
     */
    public static int soruyaCevapVer1(){
        int s1=4,s2=76;
        int sonuc = s1*s2;
        return sonuc;
    }

    public static int soruyaCevapVer2(){
        int s1=32,s2=89;
        int sonuc = s1*s2;
        return sonuc;
    }


}//class sonu
