package com.muhammet.repository;

import com.muhammet.entity.Urun;

public class UrunRepository extends RepositoryManager<Urun,Long> {
    public UrunRepository(){
        super(new Urun());
    }
}
