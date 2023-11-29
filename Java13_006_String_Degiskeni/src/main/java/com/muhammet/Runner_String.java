package com.muhammet;

import java.util.Locale;
import java.util.Scanner;

public class Runner_String {
    public static void main(String[] args) {
        /**
         * Klavye -> A -> 65 -> Monitör -> A
         * char
         * String ifade = "ifade";
         */
        char karakter = 'A';
        System.out.println(karakter);
        System.out.println((int)karakter);
        String ifade = "bugün hava çok bulutlu"; // String bir karakterler dizisidir. {'b','u','g',.....}

        /**
         * length -> bir String in uzunluğu - karakter sayısı
         * DİKKAT!!! [ ] boşluk ta bir karakterdir. sayıya dahil edilir.
         */
        System.out.println("ifadenin uzunluğu....: "+ ifade.length());

        /**
         * elimizde karakter dizi şeklinde tutulan bir değerler bütünü var ise o zaman istediğim bir değere
         * erişim sağlamalıyım.
         * charAt(Index); -> String bir ifadenin istenilen sırasında ki karakteri döner
         * DİKKAT!!!!!! Diziler dizi olarak ifade edilenler daime sıra numarası olarak 0(sıfır) dan başlar.
         * *** bu nedenle son okuyacağınız değeri String değişkeninin uzunluğu - 1 şeklinde değer alabilirsiniz.
         */
        System.out.println("********* charAt(Index) ************");
        String ad = "Muhammet"; // {'M','u','h','a','m','m','e','t'} //
        System.out.println(ad.charAt(0));
        System.out.println(ad.charAt(6));

        /**
         * Soru: aşağıda gördüğünüz şekli kendi adınızı kullanarak yapınız.
         * 1 M -> ad.charAt(0);   //1
         * 2 Mu -> ad.charAt(0); + ad.charAt(1);  //2
         * 3 Muh -> ad.charAt(0); + ad.charAt(1); + ad.charAt(2); //3
         * 4 Muha
         * 5 Muham
         * 6 Muhamm
         * 7 Muhamme
         * 8 Muhammet -> ..... + ad.charAt(7);
         *
         *      M
         *     M u
         *    M u h
         *   M u h a
         *  M u h a m
         *
         *  bu üçgen çizilecek.
         */
        System.out.println("**************************");
        System.out.println();
        for(int i=0;i<ad.length();i++){ // i=2,
            for(int j=0;j<=i;j++) //  j=3
                System.out.print(ad.charAt(j));
            System.out.println();
        }

        /**
         * indexOf(char), indexOf(String) -> girilen karakter ya da metni String ifadenin içinde arar ve bulduğu
         * ilk konumu döner.
         * DİKKAT!!! bulunan konum, index türündendir ve bir ifadenin ilk başladığı yeri döder.
         */
        ifade = "bugün hava kapalı, ancak daha bir kaç gün önce hava açık idi ancak  havalar daha da kapalı alack gibi.";
        System.out.println("c karakteriin ilk konumu....: "+ ifade.indexOf('c'));
        System.out.println("hava kelimesinin ilk görüldüğü yer....: "+ifade.indexOf("hava"));
        System.out.println("10. index ten sonra bulunan ilk hava ifadesi...: "+ifade.indexOf("hava",10));
        System.out.println("en son ratlanılan hava ifadesinin konumu...: "+ifade.lastIndexOf("hava"));
        /**
         * ÖDEV:
         * bir metinde aranılan bir kelimenini rastlandığı tüm konumları listeleyen kodu yazınız.
         */

        /**
         *
         * String bir karakterler dizisi olduğu için belli noktalardan parçalama imakanımız olabilir.
         * bunun için;
         * subString(index) -> başlangıç değerinden ifadenin sonuna kadar olan kısmı keser
         * substring(beginIndex,endIndex)  -> [beginIndex,endIndex)
         *
         *
          */
        System.out.println("************  substring   *************");
        ifade = "yeni bir güne merhaba";
        System.out.println(ifade.substring(5));// [beginIndex,ifade.length())
        System.out.println(ifade.substring(5,12));
        /**
         *
         * dosya uzantısı?
         *
         * -> sabah-yürüyüşü.10.10.2023.png
         * -> okul_gezisi.jpg
         *
         */

        /**
         *
         * str.equals(str1) -> iki String ifadenin içinde barındırdığı metinleri eşitliğini kontrol eder.
         *
         * str.trim() -> String bir ifadenin başında ve sonunda bulunan boşlukları temizler.
         *
         * str.toLowerCase(); -> String ifadeyi tamamen küçük harfle yazar.
         * str.toUpperCase(); -> String ifadeyi tamamen büyük harfle yazar.
         *
         * --> toUpperCase(Locale)
         * Locale.ENGLISH, US v.s
         *
         */

        System.out.println("************* trim() **************");
        ifade = "    bir boşlukçu dayı daha bizi gümletti. :)";
        System.out.println(ifade);
        System.out.println(ifade.trim());
        System.out.println();
        System.out.println("************** toLower - toUpper - Case *************");
        System.out.println(ifade.toUpperCase());
        System.out.println(ifade.toUpperCase(Locale.forLanguageTag("tr-TR")));
        ifade = "this java?";
        System.out.println(ifade.toUpperCase(Locale.ENGLISH));

        String ka="admin", sf="Aa.32323*?!";
        System.out.print("Kullanıcı adınızı giriniz...: ");
        String kullaniciAdi = new Scanner(System.in).nextLine();
        System.out.print("Şifrenizi giriniz...........: ");
        String sifre = new Scanner(System.in).nextLine();
        if(ka.equals(kullaniciAdi.trim().toLowerCase()) && sf.equals(sifre.trim())){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Lütfen kullanıcı adı ve şifrenizi kontrol ederek tekrar deneyiniz.");
        }



    }//main sonu
}//class sonu
