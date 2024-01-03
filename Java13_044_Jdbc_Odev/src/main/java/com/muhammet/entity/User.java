package com.muhammet.entity;

public class User {
    Long id;
    String adsoyad;
    String username;
    String password;
    String avatar;

    public User() {
    }

    public User(Long id, String adsoyad, String username, String password, String avatar) {
        this.id = id;
        this.adsoyad = adsoyad;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
    }

    public User(String adsoyad, String username, String password, String avatar) {
        this.adsoyad = adsoyad;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", adsoyad='" + adsoyad + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
