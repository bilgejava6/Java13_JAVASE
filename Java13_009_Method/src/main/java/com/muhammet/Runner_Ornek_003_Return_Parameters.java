package com.muhammet;

import java.util.Scanner;

public class Runner_Ornek_003_Return_Parameters {
    public static void main(String[] args) {
        System.out.print("hoca yasini girisin....: ");
        int hocaninYasi = new Scanner(System.in).nextInt();
       int yasFarki = yasFarkiniBul(hocaninYasi);
        System.out.println("yaş farkı.....: "+ yasFarki);

    }//main sonu

    /**
     * Methodlar çalışmadan önce kendilerini çağırandan bilgi talep edebilirler ve aldıkları
     * bilgileri kendi gövdelerinde kullanabilirler.
     *
     */
    public static int yasFarkiniBul(int yas){

        int mustafaninYasi = 30;
        int fark = yas - mustafaninYasi;
        return fark;
    }
}//class sonu
