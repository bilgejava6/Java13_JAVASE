package com.muhammet.repository;

import com.muhammet.entity.Pc;

public class PcRepository extends RepositoryManager<Pc,Long> {
    public PcRepository(){
        super(new Pc());
    }
}
