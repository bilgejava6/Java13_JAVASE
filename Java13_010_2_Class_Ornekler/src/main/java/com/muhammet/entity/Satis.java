package com.muhammet.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Satis {
    public UUID uuid;
    public String adres;
    public int indirimOrani;
    public String odemeSekli;
    public Urun urun;
    public Musteri musteri;
    public int toplamTutar;

    public Date tarih; // tarih verir. // 31.10.2023
    public LocalDateTime localDateTime; // yerelleştirilmiş şekilde tarih ve zamanı verir. 31.10.2023 11:11:22.015 UTC-3 TR-tr

}
