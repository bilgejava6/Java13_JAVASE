package com.muhammet.OdemeYontemi;

public class Runner {
    public static void main(String[] args) {
        Satis satis = new Satis();
        satis.SatisYap(new DijitalPara());
        satis.SatisYap(new Nakit());

    }
}
