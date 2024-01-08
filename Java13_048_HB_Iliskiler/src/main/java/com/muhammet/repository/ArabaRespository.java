package com.muhammet.repository;

import com.muhammet.entity.Araba;

public class ArabaRespository extends RepositoryManager<Araba,Long> {
    public ArabaRespository(){
        super(new Araba());
    }
}
