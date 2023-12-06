package com.muhammet;

public class Islemler {

    public Islemler(){
        super();
    }

    public int BolmeIslemi(int bolum, int bolen) {
        Runner_try.ifade = "Değer Atama";
        if(bolen==0){
            throw new RuntimeException("Bölen 0 Olamaz Doğru düzgün sayı gir.");
        }
        int sonuc = bolum / bolen;
        return sonuc;
    }

}
