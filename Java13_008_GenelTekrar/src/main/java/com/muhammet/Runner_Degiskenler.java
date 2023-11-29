package com.muhammet;

public class Runner_Degiskenler {
    public static void main(String[] args) {
        /**
         * en küçük sayısal değişken, bunu en büyük sayıyal değişkene ata
         * sonra bu değeri bir karater değişkenine atayıp, çıkan karakteri bize göster
         */
        byte byte_sayi = 33;
        long long_sayi = byte_sayi;
        char char_degiskeni = (char)long_sayi;
        System.out.println("çıkan karakter....: "+char_degiskeni);

        /**
         * 3 sayımız var, bu sayıların ort, 2. sayıdan büyük olup olmadığını
         * bir boolean değişkene atamaın istiyorum.
         */
        int s1=33,s2=5,s3=74;
        int ort = (s1+s2+s3)/3;
        boolean durum = ort > s2;
        System.out.println("ortalama büyük mü? "+ durum);

    }
}
