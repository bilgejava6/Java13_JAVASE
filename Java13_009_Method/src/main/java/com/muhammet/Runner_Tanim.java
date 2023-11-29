package com.muhammet;

public class Runner_Tanim {
    /**
     * Bir sınıf kodlama çizgileri içinde - (scope) tanımlanabilecek temel bileşenler
     *
     * 1- Değişken tanımları
     * 2- Method lar
     * 3- İç Sınıflar
     *
     */
    public static void main(String[] args) {


    }//main sonu

    /**
     * Method Tanımlama
     * 1- Tanım
     * aksiyon olarakta tanımlanabilir. methodlara görev veririz ve verdiğimiz görevleri yerine getirirler.
     * görevden kastımız belli bir kodu barındırmak ve gerekli olduğunda çağırılarak o kodun işlemesini
     * sağlamaktır.
     * 2- Method ların sağladığı faydalar;
     * - kodun okunurluğunu arttırır.
     * - iş bölümünü kolaylaştırır.
     * - kod terarının önüne geçer.
     * 3- Kodlama
     * public -> Access Modifier(Erişim Belirteci), yazılması zorunlu değildir.
     * static -> zorunlu değildir, önüne geldiği bileşenin adres edinimini sağlar ve sabit tutar.
     * final -> zorunlu değildir. nitelediği değeri değişmez kılar.
     * Return Type -> her method bir return type a sahiptir. Ancak her method bir değer dönmek zorunda değildir.
     * Method Name -> her method a bir ad verilir. İsimlendirme işin niteliği ile ilgili aksiyon belirtir şekilde yazılırsa doğru olur
     * eğer isim birden fazla kelime içieriyor ise, ilk harf küçük diğer kelimelerin ilk harfleri büyük olacak şekilde yazılır.
     * Parantez -> buraya eğer dışarıdan bilgi talep ediliyor ise bilgi türüne uygun şekilde tanımlama yapılır, aksi halde boş kalır.
     */

    //final double PI = 3.14;

    public void aklindanSayiTut(){
        int sayi = 5;
    }
    public int aklindanSayiTutVeSoyle(){
        int sayi = 6;
        return sayi;
    }

    public String enSevdiginYemekNedir(){
        return "Döner";
    }

    public boolean aklindanSayiTutVeDogrumuSoyle(int tahmin){//5
        int sayi= 7;
        return tahmin==sayi;
    }

    public static final Object birIslemYap(int sayi1, String ifade, boolean durum, Runner_Tanim runnerTanim,String... hobiler){
        Object o;
        o = 454;
        o = "sfdsfsff";
        o = new Runner_Tanim();
        o = 'A';
        return o;
    }


    /**
     * İnternet bağlantısını kontrol eden method olduğu varsayılmıştır.
     * @return bağlantı var ise true, değil ise false
     */
    public static boolean isConnection(){
        return true;
    }



}// class sonu
