package com.muhammet;

import com.muhammet.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em =  emf.createEntityManager();
        User user = new User("Muhammet","HOCA",
                "muhammet@gmail.com" ,"0 555 666 9988",
                "123456");
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
