package com.muhammet.repository;

import java.sql.*;

import static com.muhammet.utility.Constants.*;
public class CRUD {
    private final String databaseName;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    public CRUD(String databaseName){
        this.databaseName = databaseName;
    }

    private boolean openConnection(){
        try {
            Driver.class.forName(DRIVER_CLASS_NAME);
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://"+DB_IP+":"+DB_PORT+"/"+this.databaseName,
                    DB_USERNAME,
                    DB_PASSWORD
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
