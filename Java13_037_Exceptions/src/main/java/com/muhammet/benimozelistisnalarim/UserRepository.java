package com.muhammet.benimozelistisnalarim;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    List<User> kullaniciListesi;

    public UserRepository() {
        this.kullaniciListesi = new ArrayList<>();
        kullaniciListesi.add(new User("Muhammet"));
        kullaniciListesi.add(new User("Ayhan"));
        kullaniciListesi.add(new User("Bahar"));
        kullaniciListesi.add(new User("Canan"));
        kullaniciListesi.add(new User("Demet"));
        kullaniciListesi.add(new User("Emel"));
    }

    public User getUserByName(String userName){
        Optional<User> user = this.kullaniciListesi.stream()
                .filter(u-> u.getName().equalsIgnoreCase(userName))
                .findFirst();
        if(user.isEmpty())
            throw new BenimUserException(ErrorType.REPOSITORY_USER_NOTFOUND);
        return user.get();
    }
}
