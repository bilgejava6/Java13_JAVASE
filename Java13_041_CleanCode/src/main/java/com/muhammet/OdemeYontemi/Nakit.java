package com.muhammet.OdemeYontemi;

public class Nakit  implements Odeme {
    @Override
    public void odemeYap() {
        System.out.println("Ödeme nakit ile yapıldı.");
    }

    public void NakitParaUstuVer(){
        System.out.println("Para üstü verildi.");
    }
}
