package com.muhammet.repository;

import com.muhammet.entity.Kategori;

public class KategoriRepository extends RepositoryManager<Kategori,Long> {
    public KategoriRepository(){
        super(new Kategori());
    }
}
