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

    public Optional<User> findByUserNameAndPassword(String userName, String password){
        /**
         * filter ->
         * hiç kayıt bulamadı -> [] boş liste -> Optional.empty()
         * 1 kayıt buldu -> [User] tek elemanlı liste -> Optional.of(User)
         * 1 den fazla kayıt buldu -> [User1, User2, User3] çok elemanlı liste -> Optional.of(User1)
         *
         * ["ahmet","ali","ayten","kenan","kemal","ayşe","ayşenur","ayşegül","ayşen","ayşe"]
         *
         *
         */
      return USERLIST.stream().filter(x-> x.getUserName().equals(userName) && x.getPassword().equals(password)).findFirst();
    }

    /**
     * Kullanıcı adı daha önce alınmış mı?
     * @param userName
     * @return
     */
    public boolean existByUserName(String userName){
        if(USERLIST.stream().filter(u-> u.getUserName().equals(userName))
                .findFirst().isEmpty())
            return false;

        return true;
    }

}
