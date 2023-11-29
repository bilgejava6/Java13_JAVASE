package com.muhammed.entity;

import java.util.Date;

public class Connection {
    private String connectionUrl;
    private String adminId = "12EE";
    public String getConnection(String personelId){
        if(personelId.equals(adminId))
            return connectionUrl;
        else
            return null;
    }

    public void setConnection(String newUrl, String personelId){
        if(personelId.equals(adminId)) {
            System.out.println("personel id...: "+ personelId);
            System.out.println("tarih.........: "+ new Date());
            System.out.println("eski değer....:"+ connectionUrl);
            System.out.println("yeni değer....: "+ newUrl);

            connectionUrl = newUrl;
        }
        else
            System.out.println("Yetkiniz bulunmamaktadır.");
    }
}
