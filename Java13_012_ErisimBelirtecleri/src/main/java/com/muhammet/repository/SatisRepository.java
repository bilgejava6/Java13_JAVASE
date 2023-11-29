package com.muhammet.repository;

import com.muhammet.entity.Satis;

public class SatisRepository {

    /**
     * Satiş olgusu için,
     * Satiş,
     * Müşteri,
     * Urun gerekldir. ürünü bulmak için ürünrepository
     *  den ürünü çekmek dopru olacaktır.
     * @param satis
     */
    public void satisYap(Satis satis){
        UrunRepository urunRepository = new UrunRepository();
        urunRepository.findById(4L); // public -> aynı pakette erişim var
        urunRepository.findByProductName("");// default -> aynı paket erişim var
        urunRepository.findByBarcod("");// protected -> aynı paket erişim var
        //urunRepository.connectionTime(); // private -> aynı paket erişim yok
    }
}
