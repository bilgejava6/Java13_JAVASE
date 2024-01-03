package com.muhammet.entity;

import jakarta.persistence.*;

/**
 * Bir varlık sınıfını nasıl tanımlarız?
 * 1. Öncelikle bu sınıfın bir varlık sınıfı olduğunu belirtmeliyiz. @Entity
 * 2. Bu sınıfın tablo olarak hangi özelliklerini özelleştirmek istiyorsak ve
 * hangi tabloya karşılık geleceğini bildirmek istiyorsak @Table ile özelleştirmeliyiz.
 * DİKKAT!!!! ORM araçları bir varlık ile tablo arasındaki ilişkiyi ID alanı üzerinden kurar.
 * bu nedenle id alanı özel olarak işaretlenmelidir.
 */
@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "user_name",nullable = false, length = 100)
    String name;
    String surname;
    String email;
    @Column(unique = true)
    String phone;
    String password;

    public User() {
    }

    public User(String name, String surname,
                String email, String phone,
                String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
