package com.muhammet.repository;

import java.sql.*;

public class CRUD {
    private Connection conn;
    private ResultSet rs;


    private boolean openConnection(){
        try {
            Driver.class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/ForumDB",
                    "postgres",
                    "root"
            );
            return  true;
        }catch (Exception exception ){
            System.out.println("Bağlantı açma hatası...: "+ exception);
            return false;
        }
    }
    private void closeConnection(){
        try{
            if(!conn.isClosed())
                conn.close();
        }catch (Exception exception){
            System.out.println("Bağlantı kapatma hatası....: "+ exception);
        }
    }

    /**
     * Verilen SQL komutunu ilgili bağlantı üzserinden DB ye işler.
     * @param SQL
     * @return
     */
    public boolean executeUpdate(String SQL){
        try{
            if(openConnection()){
                conn.prepareStatement(SQL).executeUpdate();
                closeConnection();
                return true;
            }else {
                System.out.println("Bağlatı açılamadı");
                return false;
            }
        }catch (Exception exception){
            System.out.println("Database Update işlem hatası...: "+ exception);
            return false;
        }
    }

    public ResultSet getAllTableRows(String SQL){
        try{
            if(openConnection()){
                rs = conn.prepareStatement(SQL).executeQuery();
                closeConnection();
                return rs;
            }else {
                System.out.println("Başlantı açılamadı");
                return null;
            }
        }catch (Exception exception){
            System.out.println("Database sorgu hatası...: "+ exception);
            return null;
        }
    }

}
