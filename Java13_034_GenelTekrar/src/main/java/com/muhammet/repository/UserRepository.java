package com.muhammet.repository;

import com.muhammet.entity.User;

import java.util.List;
import java.util.Optional;

import static com.muhammet.utility.DB.*;

public class UserRepository {
    /**
     * Create
     * Rad
     * Update
     * Delete
     *
     */



    public void save(User user){
        USERLIST.add(user);
    }

    public void update(User user){
        /**
         * 1. Yöntem, değiştirilmek istenilen biler alınarak kullanıcının varlığı
         * liste içinde sorgulanır ve index numarası bulunur. daha sonra ilgili kayıt yenisi
         * ile set edilir.
         */
        // USERLIST.stream().filter(x->x.getUuid().equals(user.getUuid())).findFirst()
        // USERLIST.set(5,user);
        /**
         * 2. Yönetem, liste içinde foreach ile gezilir, aranılan kayıt a ulaşılınca yeni değer
         * ile ilgili kayıt değiştirilir.
         */
        USERLIST.forEach(x->{
            if(x.getUuid().equals(user.getUuid())){
                x.setPassword(user.getPassword());
                x.setName(user.getName());
            }
        });
    }

    public void delete(String uuid){
        USERLIST.stream().filter(u-> u.getUuid().equals(uuid)).findFirst().ifPresent(ahmetAmca->{
            USERLIST.remove(ahmetAmca);
        });
    }

    public List<User> findAll(){
        return USERLIST;
    }

    public Optional<User> findById(String uuid){
        return USERLIST.stream().filter(x-> x.getUuid().equals(uuid)).findFirst();
    }

    /**
     * Kullanıcı adına göre kullanıcıyı bulur. Ancak kullanıcı adının tamamını yazmak
     * zorunda değilsiniz, Kullanıcı adıları içinde verilen ifadeyi arar ifadeyi
     * içeren tüm benzer kayıtları döndürür.
     * @param userName
     * @return
     */
    public List<User> findAllByUserName(String userName){
        return USERLIST.stream().filter(x-> x.getUserName().contains(userName)).toList();
    }



}