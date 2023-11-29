package com.muhammet.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Runner_Kuyruk {
    public static void main(String[] args) {
        //String[] liste;// {"","","","",""}
        Queue<String> hastahaneSirasi = new LinkedList<>();
        System.out.println("**** HASTANE KUYRUK SİSTEMİ ****");
        hastahaneSirasi.add("Ayşe Teyze");
        hastahaneSirasi.add("Minik Ahmet");
        hastahaneSirasi.add("Murat Bey");
        hastahaneSirasi.add("Handan hanım");
        hastahaneSirasi.add("Bülent Amca");
        hastahaneSirasi.add("Ve Ben");

        System.out.println(hastahaneSirasi);
        System.out.println("********************************");
        String siradakiHasta = hastahaneSirasi.peek();
        System.out.println("Sırada bekleyen hasta.....: "+ siradakiHasta);
        String iceriAlinanHasta = hastahaneSirasi.remove();
        System.out.println("İçeriye alınan hasta......: "+ iceriAlinanHasta);
        siradakiHasta = hastahaneSirasi.peek();
        System.out.println("Sırada bekleyen hasta.....: "+ siradakiHasta);
        iceriAlinanHasta = hastahaneSirasi.poll();
        System.out.println("İçeriye alınan hasta......: "+ iceriAlinanHasta);
        siradakiHasta = hastahaneSirasi.peek();
        System.out.println("Sırada bekleyen hasta.....: "+ siradakiHasta);
        /**
         * DİKKAT!!!!!!
         * remove(); sıradaki kaydi okur ve listeden çıkartır. Ancak eğer silinecek bir kayıt
         * kalmamış ise hata fırlatır.
         * poll(); sıradaki kaydı okur ve listeden çıkartır. Ancak eğer silineek bir kayıt
         * bulunamaz ise null değer döner.
         *
         */
        String silinenDeger = hastahaneSirasi.poll();
        silinenDeger =hastahaneSirasi.poll();
        silinenDeger =hastahaneSirasi.poll();
        silinenDeger =hastahaneSirasi.poll();
        silinenDeger = hastahaneSirasi.poll();
        silinenDeger =hastahaneSirasi.poll();


        System.out.println("**********************************");
        System.out.println(hastahaneSirasi);

    }
}
