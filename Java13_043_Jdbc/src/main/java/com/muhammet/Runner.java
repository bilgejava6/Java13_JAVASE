package com.muhammet;

import java.sql.*;

public class Runner {

    public static void main(String[] args) throws Exception{

        Driver.class.forName("org.postgresql.Driver");
        // Syntax: jdbc:[DATABASE TYPE]://IP:PORT/DB NAME
        String adres = "jdbc:postgresql://localhost:5432/OgretmenKitapKiralamaDB";
        String ka = "postgres";
        String sf = "root";
        Connection conn = DriverManager.getConnection(adres,ka,sf);
        String SQL = "select * from tblkonu";
                //"delete from tblkonu where id=8";
                //"update tblkonu set ad='Yazılım Java' where id=8";
                //"insert into tblkonu(ad) values('Yazılım')";
        PreparedStatement pr = conn.prepareCall(SQL);
        // pr.executeUpdate(); -- create,update,delete
        ResultSet rs = pr.executeQuery();
        /**
         * 1- Anı
         * 2- Belgesel & Roman
         *
         */
        while (rs.next()){ // size gelen data içinde satır satır gezme işlemini yapar
            int id = rs.getInt("id");
            String ad = rs.getString("ad");
            System.out.println("id...: "+ id+ " - ad...: "+ ad);
        }
        conn.close();
    }
}
