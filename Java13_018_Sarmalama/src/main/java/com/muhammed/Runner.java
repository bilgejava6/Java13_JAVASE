package com.muhammed;

import com.muhammed.entity.Connection;

public class Runner {
    public static void main(String[] args) {
        /**
         * Encapsulation -> Sarmalama
         *
         */
        Connection conn = new Connection();
        //conn.connectionUrl = "Ankara";
        conn.setConnection("Ankara","12EE");
        System.out.println("Bağlantı adresi...: "+
                conn.getConnection("12EE"));
        //conn.connectionUrl = "İzmir";
        conn.setConnection("İzmir","AA11");
        System.out.println("Bağlantı adresi...: "+
                conn.getConnection("12EE"));
    }
}
