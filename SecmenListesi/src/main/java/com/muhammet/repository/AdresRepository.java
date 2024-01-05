package com.muhammet.repository;

import com.muhammet.entity.Adres;

public class AdresRepository extends RepositoryManager<Adres,Long>{
    public AdresRepository(){
        super(new Adres());
    }
}
