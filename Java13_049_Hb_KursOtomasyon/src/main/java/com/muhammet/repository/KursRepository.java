package com.muhammet.repository;

import com.muhammet.entity.Kurs;

public class KursRepository extends RepositoryManager<Kurs,Long> {
    public KursRepository(){
        super(new Kurs());
    }

}
