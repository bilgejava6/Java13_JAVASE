package com.muhammet.repository;

import com.muhammet.entity.Bilesen;

public class BilesenRepository extends RepositoryManager<Bilesen,Long>{
    public BilesenRepository(){
        super(new Bilesen());
    }
}
