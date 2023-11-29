package com.muhammet.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BankaHesabi {
    Long id;
    String iban;
    String hesapNumarasi;
    Long musteriId;
    BigDecimal limlit;
    LocalDateTime hesapAcilisTarihi;
    String hesapTuru;
    String dovizCinsi;
    BigDecimal metvutPara;
    String subeAdi;
    String subeNo;


}
