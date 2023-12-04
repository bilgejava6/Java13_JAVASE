package com.muhammet.service;

import com.muhammet.entity.User;
import com.muhammet.repository.UserRepository;

import java.util.List;
import java.util.Optional;


public class UserService {
    private UserRepository repository;
    public UserService(){
        repository = new UserRepository();
    }

    /**
     * DİKKAT!!!!!!!
     * Bu sınıfta kullanılan methodlar controller tarafından iletilen bilgileri
     * alarak işlem yaparlar. Bu nedenle controller dan gelen veriler doğru
     * kabul edilir. Ancak verilerin tutarlılığı kontrol edilmelidir.
     * userName -> enaz 3 karakter, türkçe karakter içermemesi, boşluk içermemesi
     * password -> enaz 8 karakter olmalı, bir büyük bir küçük harf
     * ---------------------------------
     * Servis
     *  kullanıcı adı daha önce alınmış mı?
     *
     * ---------------------------------
     *  Kurgu:
     *  Eğer kullnıcı adı daha önce alınmış ise kontrol edelim ve
     *  kullanıcıya bilgi verelim. Kayıt işlemi yapılamadığını bildirelim.
     *  -----
     *  1- Kullanıcı daha önce alınmış mı?
     *
     */
    public boolean save(User user){
        /**
         * Eğer kullanıcı daha önce kayıt edilmiş ise kayıt işlemi yapılmaz ve false döndürülür.
         */
       if(repository.existByUserName(user.getUserName()))
           return false;
        repository.save(user);
        return true;
    }

    public Optional<User> findByUserNameAndPassword(String userName, String password){
        return  repository.findByUserNameAndPassword(userName,password);
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String userId){
        return repository.findById(userId).get();
    }
}
