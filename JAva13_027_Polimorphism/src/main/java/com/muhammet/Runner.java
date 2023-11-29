package com.muhammet;

import com.muhammet.entity.BuyukbasHayvanBakisici;
import com.muhammet.entity.KucukbasHayvanBakicisi;
import com.muhammet.entity.KumesHayvanBakicisi;
import com.muhammet.entity.ToprakAgasi;

public class Runner {
    public static void main(String[] args) {

        ToprakAgasi toprakAgasi = new ToprakAgasi();
        toprakAgasi.Besle();
        BuyukbasHayvanBakisici buyukbasHayvanBakisici = new BuyukbasHayvanBakisici();
        buyukbasHayvanBakisici.Besle();
        KucukbasHayvanBakicisi kucukbasHayvanBakicisi = new KucukbasHayvanBakicisi();
        kucukbasHayvanBakicisi.Besle();
        KumesHayvanBakicisi kumesHayvanBakicisi = new KumesHayvanBakicisi();
        kumesHayvanBakicisi.Besle();
        /**
         * Çok Biçimlilik
         * bir sınıfın ya da interface in başka bir sınıfın nesne referansını tutabilmesi durumudur.
         */
        toprakAgasi = new BuyukbasHayvanBakisici();
        toprakAgasi.Besle();
        toprakAgasi = new KucukbasHayvanBakicisi();
        toprakAgasi.Besle();
        toprakAgasi = new KumesHayvanBakicisi();
        toprakAgasi.Besle();
    }
}
