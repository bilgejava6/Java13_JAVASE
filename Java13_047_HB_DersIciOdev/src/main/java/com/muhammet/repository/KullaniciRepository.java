package com.muhammet.repository;

import com.muhammet.entity.Kullanici;

public class KullaniciRepository extends RepositoryManager<Kullanici,Long> {
    public KullaniciRepository(){
        super(new Kullanici());
    }

}
