package com.muhammet.entity;

public class Arac {
    public String uuid;
    public String yakitTuru;
    public int yolcuSayisi;
    public int hiz;

    public Arac() {
    }

    public Arac(String uuid, String yakitTuru, int yolcuSayisi, int hiz) {
        this.uuid = uuid;
        this.yakitTuru = yakitTuru;
        this.yolcuSayisi = yolcuSayisi;
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "uuid='" + uuid + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", yolcuSayisi=" + yolcuSayisi +
                ", hiz=" + hiz +
                '}';
    }

    public void hizlan(){
        hiz +=5;
    }
}
