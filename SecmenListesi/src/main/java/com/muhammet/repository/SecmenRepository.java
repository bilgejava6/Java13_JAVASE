package com.muhammet.repository;

import com.muhammet.entity.Secmen;
import com.muhammet.view.VwSecmen;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SecmenRepository {
    private EntityManagerFactory emf;
    private EntityManager manager;
    public SecmenRepository(){
        emf = Persistence.createEntityManagerFactory("CRM");
        manager = emf.createEntityManager();
    }

    public void save(Secmen secmen){
        manager.getTransaction().begin();
        manager.persist(secmen);
        manager.getTransaction().commit();
    }

    public List<Secmen> findAll(){
        /**
         * select * from tblsecmen
         * criteria -> sizin sorgularını tyanımlamak için kullanılrı.
         * root -> entity içindeki alanları özel olarak belirlemek için kullanılır.
         */
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Secmen> criteriaQuery =  builder.createQuery(Secmen.class); // hangi entity üzerinde işlem yapacağımızı belirtiyoruz.

        Root<Secmen> root =  criteriaQuery.from(Secmen.class); // select *
        criteriaQuery.select(root); // select * from tblsecmen

        List<Secmen> result = manager.createQuery(criteriaQuery).getResultList(); // git DB de sorguyu çalıştır ve sonucu dön
        return result;
    }

    /**
     * Select One Column
     * @return
     */
    public List<String> getAllTckimlik(){
        /**
         * select tckimlik from tblsecmen
         */
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery<String> criteriaQuery = criteriaBuilder.createQuery(String.class);

        Root<Secmen> root = criteriaQuery.from(Secmen.class);
        criteriaQuery.select(root.get("tckimlik")); // select tckimlik from tblsecmen

        List<String> tcList = manager.createQuery(criteriaQuery).getResultList();
        return tcList;
    }

    public Optional<Secmen> findById(Long id){
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery<Secmen> criteriaQuery = criteriaBuilder.createQuery(Secmen.class); // select * from tblsecmen where id=? ->
        Root<Secmen> root = criteriaQuery.from(Secmen.class);
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get("id"),id));
        Secmen secmen;
        try{
            secmen =  manager.createQuery(criteriaQuery).getSingleResult();
            return Optional.of(secmen);
        }catch (NoResultException exception){
            return Optional.empty();
        }
    }

    /**
     * Select Many Column
     * @return
     */
    public List<Object[]> getTcKimlikAndName(){
        /**
         * select tckimlik,ad from tblsecmen
         */
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);

        Root<Secmen> root = criteriaQuery.from(Secmen.class);

        Path<String> pathTc = root.get("tckimlik");
        Path<String> pathAd = root.get("ad");
        criteriaQuery.select(criteriaBuilder.array(pathAd,pathTc)); // select ad,tckimlik from

        List<Object[]> result = manager.createQuery(criteriaQuery).getResultList();
        return result;
    }

    /**
     * Using Tuple
     */
    public List<VwSecmen> getAllViewSecmen(){
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery<Tuple> criteriaQuery = criteriaBuilder.createQuery(Tuple.class);
        Root<Secmen> root = criteriaQuery.from(Secmen.class);
        Path<String> tckimlik = root.get("tckimlik");
        Path<String> ad = root.get("ad");
        criteriaQuery.multiselect(tckimlik,ad);
        List<Tuple> tuples = manager.createQuery(criteriaQuery).getResultList();

        List<VwSecmen> result = new ArrayList<>();
        tuples.forEach(t->{
             // t.get(0) -> tuple içinden 1. değeri almak için kullanılabilir.
             result.add(new VwSecmen(t.get(ad),t.get(tckimlik)));
        });
        return  result;
    }

    /**
     * Group By
     */
    public List<Object[]> getAdCount(){
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);

        Root<Secmen> root = criteriaQuery.from(Secmen.class);
        criteriaQuery.groupBy(root.get("ad")); // select ad,count(*) from group by ad
        criteriaQuery.multiselect(root.get("ad"),criteriaBuilder.count(root));

        return manager.createQuery(criteriaQuery).getResultList();
    }

    /**
     * Bazen ihtityaçlarımızı karşılamak için doğrudan SQL komutu yazmak isteyebiliriz.
     * bu gibi durumlarda Native olarak SQl yazabilirsiniz.
     * @return
     */
    public List<Object[]> findAlNativeSQL(){
        List<Object[]> result = manager.createNativeQuery("select * from tblsecmen").getResultList();
        return  result;
    }

    public List<Secmen> findAllNativeSQLSecmen(){
        return  manager
                .createNativeQuery("select * from tblsecmen", Secmen.class)
                .getResultList();
    }


    public List<Secmen> findAllNamedQuery(){
        return manager.createNamedQuery("Secmen.findAll", Secmen.class).getResultList();
    }

    public Optional<Secmen> findOptionalById(Long id){
        Secmen secmen;

        TypedQuery<Secmen> query =
                manager.createNamedQuery("Secmen.FindById", Secmen.class);
        query.setParameter("ahmet_amca_nasilsin",id);
        try{
            secmen = query.getSingleResult();
            return  Optional.of(secmen);
        }catch (NoResultException exception){
            return Optional.empty();
        }

    }

}
