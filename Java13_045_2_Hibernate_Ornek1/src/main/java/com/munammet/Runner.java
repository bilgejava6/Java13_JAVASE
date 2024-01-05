package com.munammet;

import com.munammet.entity.Musteri;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();
        Musteri mst = new Musteri("Muhammet","Istanbul");

        em.getTransaction().begin();
        em.persist(mst);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
