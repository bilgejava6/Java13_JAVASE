package com.muhammet;

import com.muhammet.entity.Personel;

public class Runner {
    /**
     * final keyword -> önüne geldiği bileşeni değişmez kılar.
     * Nelere dikkat edelim?
     * final kullanılan bir bileşen, uygulamanız adreslenmeden önce mutlaka değeri atanmalıdır.
     * DİKKAT!!!! final keyword ile kullanılan bir değişkene değer ataması, ya direkt yapılır
     * ya da sınıf adreslenmeden önce yapılır. Yani statik olmayan bir method final değişkene
     * atama yapamaz.
     */
    public static void main(String[] args) {
        Personel personel = new Personel("Muhasebe Departmanı");
        personel.ad ="Muhammet";
        personel.id = "1";
        personel.adres = "Ankara";
        System.out.println(personel);

        personel.ad = "ali";
        personel.adres = "izmir";
        personel.id = "2";
        System.out.println(personel);
    }
}
