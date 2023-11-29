package com.muhammet.repository;

/**
 * Bir sınıfı başka bir sınıf miras almak isterse extentds kullanır.
 * Ancak, bir sınıf bir interface i miras almak onunla sözleşme
 * yapmak isterse implements kullanır.
 * Bir interface implement olarak miras alındığında o interface in
 * tüm methodlarını kullanmak zorunda kalırsınız.
 */
public class MusteriRepositoryImpl implements Repository {
    @Override
    public void kaydet() {

    }

    @Override
    public void sil() {

    }

    @Override
    public void guncelle() {

    }

    @Override
    public void listele() {

    }

//    public void musteriKaydet(Musteri musteri){
//
//    }
//
//    public Musteri save(Musteri musteri){
//        return  null;
//    }
//
//    public void mstKaydet(String ad,String soyad,String adres){
//
//    }
//
//    public void kaydetMusteriEkip2(Musteri mst){
//
//    }



}
