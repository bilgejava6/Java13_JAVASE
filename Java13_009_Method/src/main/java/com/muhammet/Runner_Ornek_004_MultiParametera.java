package com.muhammet;

public class Runner_Ornek_004_MultiParametera {
    public static void main(String[] args) {
        System.out.println("En Büyük Sayı................: "+ hangiSayiBuyuk(2,-90,76,3));
        System.out.println("En Büyük Sayı Alternatifi....: "+ hangiSayiBuyukAlt(2,-90,76,3));

    }//main sonu
    /**
     * bir method 1...n e kadar parametre alabilir, yani birden fazla parametre geçilebilir.
     */
    public static int sayilariCarp(int sayi1,int sayi2, int sayi3){
        int carpim = sayi1*sayi2*sayi3;
        return carpim;
    }

    public static int hangiSayiBuyuk(int s1,int s2,int s3,int s4){
        int enb;
        if (s1>s2 && s1>s3 && s1>s4)
            enb = s1;
        else if(s2>s1 && s2>s3 && s2>s4)
            enb = s2;
        else if(s3>s1 && s3>s2 && s3>s4)
            enb = s3;
        else
            enb = s4;
        return enb;
    }

    /**
     * DİKKAT!!!!!!!!
     * bir method içinde return işlemi o method un sonlandığını bildirir. bu neden o andan itibaren diğer
     * kodlamalar işletilmez method cevap vermiş sayılır.
     */
    public static int hangiSayiBuyukAlt(int s1,int s2,int s3,int s4){
        if (s1>s2 && s1>s3 && s1>s4) return s1;
        else if(s2>s1 && s2>s3 && s2>s4) return s2;
        else if(s3>s1 && s3>s2 && s3>s4) return s3;
        else return s4;
    }


}//class sonu
