package com.bilgeadam.insankaynaklari;

public class Matematik {
    /**
     * Temel aritmetik işlemler
     * Sıralama işlemleri
     * Ortalama bulma
     * EnBüyük, EnKüçük sayı bulma
     */

    /**
     * Bu method virgül ile ayırılmış sayıları bir biri ile
     * toplayan ve int tipinde sounç dönen bir methoddur.
     * @param sayilar : sayıları virgül ile ayırarak giriniz.
     * @return : toplam sonucunu int olarak döner.
     */
    public int toplam(int... sayilar){
        int result=0;
        for (int sayi: sayilar) // foreach
            result +=sayi;
        return  result;
    }

    public int enBuyukSayi(int... sayilar){
        int enb= sayilar[0];
        for (int i=1;i<sayilar.length;i++)
            if (enb<sayilar[i])
                enb = sayilar[i];
        return enb;
    }

    /**
     * TODO: bu kod tekrar düzenlenecek ve içi kodlanacak.
     * @param sayilar
     * @return
     */
    public double bolum(double... sayilar){
        return 0;
    }
}
