package com.muhammet.repository;

import com.muhammet.entity.Musteri;
import com.muhammet.utility.VeriTabani;

public class MusteriRepository {
    private int musteriSayisi = 0;
    public void save(String ad, String telefon, String adres){
        Musteri musteri = new Musteri();
        musteri.id = musteriSayisi+1;
        musteri.ad = ad;
        musteri.adres = adres;
        musteri.telefon = telefon;
        VeriTabani.musteriListesi[musteriSayisi++] = musteri;
    }

    public void findAll(){
        for(int i=0;i<musteriSayisi;i++){
            Musteri mst = VeriTabani.musteriListesi[i];
            System.out.println(mst.id+" - "+mst.ad+ " - "+ mst.adres);
        }
    }
}
