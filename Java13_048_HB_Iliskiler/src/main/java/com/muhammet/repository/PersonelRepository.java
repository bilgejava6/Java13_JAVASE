package com.muhammet.repository;

import com.muhammet.entity.Personel;

public class PersonelRepository extends RepositoryManager<Personel,Long> {
    public PersonelRepository(){
        super(new Personel());
    }
}
