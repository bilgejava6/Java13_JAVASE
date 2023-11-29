package com.muhammet;

import java.util.Scanner;

public class Runner_Soru {
    public static void main(String[] args) {
        System.out.print("Lütfen ifadeyi giriniz....: ");
        String girilen_kelime = new Scanner(System.in).nextLine();
        System.out.println("sonuç tümü büyük.....: "+ buyukHarfeCevir(girilen_kelime,"TümüBüyük"));
        System.out.println("sonuç tümü küçük.....: "+ buyukHarfeCevir(girilen_kelime,"TümüKüçük"));
        System.out.println("sonuç ilk harfler....: "+ buyukHarfeCevir(girilen_kelime,"IlkHarfBuyuk"));

    }//main sonu
    /**
     * bir method istiyorum. bu method, iki adet string alacak[ifade,islemTuru]
     * işlem türleri;
     * 1- Tümünü büyük harfe çevir
     * 2- Tümünü küçük harfe çevir
     * 3- Sadece Baş Harflerini büyük harfe çevir
     * method girilen ilk String ifade değişkenini istenilen işlem türüne göre kodlayacak ve
     * sonuç olarak istenileni verecek.
     */
    public static String buyukHarfeCevir(String ifade,String islemTuru){
        String result="";
        switch (islemTuru){
            case "TümüBüyük":
                result = ifade.toUpperCase();
                break;
            case "TümüKüçük":
                result = ifade.toLowerCase();
                break;
            case "IlkHarfBuyuk":
                //result = ifade.replace(String.valueOf(ifade.charAt(0)),String.valueOf(ifade.charAt(0)).toUpperCase());

                break;
            default:
                System.out.println("Geçerli bir seçim yapınız."); break;
        }
        return result;
    }

}//class sonu
