package com.muhammet;

import com.muhammet.entity.Satis;
import com.muhammet.entity.Urun;
import com.muhammet.repository.SatisRepository;
import com.muhammet.repository.UrunRepository;

public class Runner {
    public static void main(String[] args) {
        SatisRepository repository = new SatisRepository();
        Satis satis = new Satis();
        repository.save(satis);

        UrunRepository urunRepository = new UrunRepository();
        Urun urun = new Urun();
        urunRepository.save(urun);

    }
}
