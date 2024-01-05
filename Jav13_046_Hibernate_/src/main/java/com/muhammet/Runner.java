package com.muhammet;

import com.muhammet.entity.BaseEntity;
import com.muhammet.entity.Musteri;
import com.muhammet.utility.enums.Cinsiyet;
import com.muhammet.utility.enums.Yetki;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Musteri mst = new Musteri();
        mst.setAd("Muhammet");
        mst.setSoyad("Karakaya");
        mst.setCinsiyet(Cinsiyet.ERKEK);
        BaseEntity baseEntity =new BaseEntity();
        baseEntity.setCreateat(System.currentTimeMillis());
        baseEntity.setUpdateat(System.currentTimeMillis());
        baseEntity.setState(1);
        mst.setBaseEntity(baseEntity);
        mst.setDogumTarihi(new Date());
        mst.setYetki(Yetki.ADMIN);
        mst.setHobiler(List.of("Kitap Okumak","Spor Yapmak","Yazılım Geliştirmek"));

        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM")){
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(mst);
            em.getTransaction().commit();
            em.close();
        }


    }
}
