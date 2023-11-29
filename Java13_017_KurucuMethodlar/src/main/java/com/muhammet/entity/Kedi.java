package com.muhammet.entity;

public class Kedi {
    public Long id;
    public String ad;
    public String tur;
    public int agirlik;
    public int uzunluk;

    /**
     * Constructor - Yapıcı, Kurucu Method
     * Default Constructor
     * siz yazmasanız dahi her class içinde default constructor bulunur.
     * DİKKAT!!!!!
     * constructor geri dönüş değeri içermez ancak geriye değer döner
     * dönmekte olduğu değer ise yaratılan nesnenin referansıdır.
     *
     */
    public  Kedi(){
        agirlik = 300;
        uzunluk = 30;
        ad = "Tekir";
        System.out.println("Kedi constructor çalıştı");
    }

    /**
     * Parameterli Constructor
     * @param kediAdi
     * @param kediUzunlugu
     * @param kediAgirligi
     */
    public Kedi(String kediAdi,int kediUzunlugu, int kediAgirligi){
        ad = kediAdi;
        uzunluk = kediUzunlugu;
        agirlik = kediAgirligi;
    }

    public int toplam(){
        return 5+4;
    }

    public void topla(){
        int toplama = 5+4;
    }



}
