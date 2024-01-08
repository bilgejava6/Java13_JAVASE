package com.muhammet.repository;

import com.muhammet.entity.Resim;

public class ResimRepository extends RepositoryManager<Resim,Long> {
    public ResimRepository(){
        super(new Resim());
    }
}
