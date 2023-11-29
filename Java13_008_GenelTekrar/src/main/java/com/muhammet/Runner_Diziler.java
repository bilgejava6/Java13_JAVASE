package com.muhammet;

import java.util.Scanner;

public class Runner_Diziler {
    public static void main(String[] args) {
        /**
         * Bir işletme sahibi kiraladığı araçların kimlere kiralandığını ve iade zamanlarını
         * tutmak ve bunları istediği zaman görüntülemek istemektedir. Bunu yapabilecek çok boyutlu
         * dizi öğrneği yazınız.
         *
         * Kiralama:
         * Sıra No |  Araç - Plaka  |
         */
        int secim;
        String[][] aracListesi = new String[3][5];
        /**
         * 1. Araç
         */
        aracListesi[0][0] = "KIRA001";
        aracListesi[0][1] = "Mercedes S350";
        aracListesi[0][2] = "06 AAAA 999";
        aracListesi[0][3] = "1.500₺";
        aracListesi[0][4] = "AKTIF"; // aktif - kirada
        /**
         * 2. Araç
         */
        aracListesi[1][0] = "KIRA002";
        aracListesi[1][1] = "Audi A7";
        aracListesi[1][2] = "06 BBBB 999";
        aracListesi[1][3] = "1.620₺";
        aracListesi[1][4] = "AKTIF"; // aktif - kirada
        /**
         * 3. Araç
         */
        aracListesi[2][0] = "KIRA003";
        aracListesi[2][1] = "BMW i5";
        aracListesi[2][2] = "06 CCCC 999";
        aracListesi[2][3] = "2.100₺";
        aracListesi[2][4] = "AKTIF"; // aktif - kirada

        /**
         * araç no - araç adı - kiralayan - k. tarihi  - iade tarihi - toplam tutar - ödeme
         *
         */
        String[][] kiralamaListesi = new String[200][6];
        int kiralamaSayisi=0;
        do{
            System.out.println("************************************");
            System.out.println("****  ARAÇ KİRALAMA SİSTEMİ ********");
            System.out.println("************************************");
            System.out.println();
            System.out.println("1- Aktif Araç Listesi");
            System.out.println("2- Araç Kiralama");
            System.out.println("3- Kiralama Listesi");
            System.out.println("4- Araç İade");
            System.out.println("0- ÇIKIŞ");
            System.out.println();
            System.out.print("lütfen seçiniz.....: ");
            secim = new Scanner(System.in).nextInt();
            switch (secim){
                case 1:
                    for(int i=0;i<3;i++){
                        if(!aracListesi[i][4].equals("AKTIF")) continue;
                        for (int j=0;j<5;j++){
                            System.out.print(aracListesi[i][j]+ " - ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("********************************");
                    System.out.println("****      ARAÇ KİRALAMA     ****");
                    System.out.println();
                    System.out.print("Hangi aracı kiralayacaksınız?...: ");
                    int indexNo = new Scanner(System.in).nextInt();
                    kiralamaListesi[kiralamaSayisi][0] =  aracListesi[indexNo][0]; // araç kodu
                    kiralamaListesi[kiralamaSayisi][1] = aracListesi[indexNo][1]; // araç adı
                    System.out.print("Kiralayan Bilgisi....: ");
                    kiralamaListesi[kiralamaSayisi][2] = new Scanner(System.in).nextLine();
                    System.out.print("Kiralama Tarihi....: ");
                    kiralamaListesi[kiralamaSayisi][3] = new Scanner(System.in).nextLine();
                    System.out.print("İade Tarihi....: ");
                    kiralamaListesi[kiralamaSayisi][4] = new Scanner(System.in).nextLine();
                    System.out.print("Tutar....: ");
                    kiralamaListesi[kiralamaSayisi][5] = new Scanner(System.in).nextLine();

                    aracListesi[indexNo][4] = "KIRADA";
                    kiralamaSayisi++;
                    break;
                case 3:
                    System.out.println("*****************************");
                    System.out.println("****  KİRALAMA LİSTESİ   ****");
                    for(int i=0;i<kiralamaSayisi;i++){
                        for(int j=0;j<6;j++)
                            System.out.print(kiralamaListesi[i][j]+" - ");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("***** ARAÇ İADE  *******");
                    System.out.print("iade edilecek araç numarası....: ");
                    int aracIndexNo = new Scanner(System.in).nextInt();
                    aracListesi[aracIndexNo][4] = "AKTIF";
                    break;
                case 0:
                    System.out.println("Çıkış Yapıldı"); break;
                default:
                    System.out.println("Geçersiz seçim");
            }
        }while (secim!=0);




    }//main sonu
}// class sonu
