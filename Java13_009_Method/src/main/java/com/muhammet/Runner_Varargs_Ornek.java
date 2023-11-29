package com.muhammet;

public class Runner_Varargs_Ornek {
    public static void main(String[] args) {
        int s1, s2, toplam;
        s1 = 5;
        s2 = 9;
        toplam = s1+s2;
        System.out.println("Muhammet hoca "+s1+" ile "+ s2+ " sayı değerinin toplamının "+ toplam+" olduğunu söyledi");
        System.out.println(
        specialReplace("@4 muhammet hoca @0 ile @1 sayı değerlerinin toplamının @2 olduğunu söyledi bu @3 dir.",
                s1,s2,toplam, true,"İşlem Detay: ")
        );
    }//main sonu

    /**
     * Bir ifade içinde değiştirilmek istenilen yerlerin [@1] şeklinde ifade edilerek
     * değiştirilecek değerlerin yerlerinin belirlenmesi ve girilen parametrelerle
     * değiştirilmesi sağlanmalıdır.
     * Örn:
     * ifade: "muhammet hoca @0 ile @1 sayı değerlerinin toplamının @2 olduğunu söyledi."
     * specialReplace(ifade,5,9,14)
     * sonuç: muhammet hoca 5 ile 9 sayı değerlerinin toplamının 14 olduğunu söyledi.
     * @param ifade
     * @param replace
     * @return
     */
    public static String specialReplace(String ifade, Object... replace){
        for (int i=0;i< replace.length;i++){
            ifade = ifade.replace("@"+i,replace[i]+""); //replace("@0","5")
        }
        return ifade;
    }

}//class sonu
