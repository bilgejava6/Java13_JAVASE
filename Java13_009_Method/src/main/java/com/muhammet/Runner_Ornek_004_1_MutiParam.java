package com.muhammet;

public class Runner_Ornek_004_1_MutiParam {
    public static void main(String[] args) {
        System.out.println("işlem toplama......: "+ islemYap(4,8,"Toplama"));
        System.out.println("işlem çarpma......: "+ islemYap(4,8,"Çarpma"));

    }//main sonu

    public static int islemYap(int s1, int s2, String islemTuru){
        int sonuc;
        switch (islemTuru){
            case "Toplama": sonuc = s1+s2;break;
            case "Çıkartma": sonuc = s1-s2;break;
            case "Çarpma": sonuc = s1*s2;break;
            case "Bölme": sonuc = s1/s2;break;
            default: sonuc = 0; break;
        }
        return sonuc;
    }

}//class sonu
