package com.muhammet.repository;

import com.muhammet.entity.Kursiyer;

public class KursiyerRepository extends RepositoryManager<Kursiyer,Long> {
    public KursiyerRepository(){
        super(new Kursiyer());
    }
}
