package com.muhammet.repository;

public interface Repository {
    /**
     * Interface
     * bir interface sözleşme gibi temel tanımları içereceği için sınıf gövdesinde tanımlanan
     * methodların hiçibiri method gövde parantezlerini içeremez. yani methodlar sadece
     * tanımlanabilir kod yazılamaz.
     */
    void kaydet();
    void sil();
    void guncelle();
    void listele();
}
