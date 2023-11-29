package com.muhammet.entity;

public class Araba extends Arac{
    public int vites;
    public String plaka;
    public int maxHiz;

    /**
     * Method Overriding - miras alınan bir method un ezilerek yeni özellikler
     * katılması, yani metod gövdesinin yeniden yazılması.
     */
    @Override
    public void hizlan(){
        if(vites<=1)
            hiz +=6;
        else
            hiz += 6*vites;
    }

    /**
     * Method Overloading - bir method aynı isim ile tekrar tekrar tanımlanıyor ise o method
     * aşırı yüklenmiş demektedir. Yani aynı method isimini tekrar kullanmaya Overloading denilir.
     * @param yeniVitesDurumu
     */
    public void hizlan(int yeniVitesDurumu){
        hiz += 6*yeniVitesDurumu;
        vites = yeniVitesDurumu;
    }


}
