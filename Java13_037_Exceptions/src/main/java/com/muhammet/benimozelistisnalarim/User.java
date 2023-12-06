package com.muhammet.benimozelistisnalarim;

import java.util.Random;

public class User {
    Long id;
    String name;

    public User(String name) {
        this();
        this.name = name;
    }

    public User() {
        this.id = new Random().nextLong();
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
}
