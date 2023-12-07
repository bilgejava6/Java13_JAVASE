package com.muhammet;

import com.muhammet.etity.Log;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        /**
         * Dosya İşlemleri - IO -> Input/Output
         * Bilgisayar içinde kullanmakta olduğunuz tüm dosyalar(File) aynıdır aynı şekilde okunur.
         * ancak okunan dataların yorumlanması onu okuyan uygulamaya bağlı olarak değişir.
         * Bir dosya tanımlamak için [DosyaAdı].[Uzantı] şeklinde kullanılır.
         * burada dikkat etmeniz gereken temel nokta, bir dosya uzantısı ne olursa olsun özünü korur.
         * jpg, jpeg, png, ico v.s -> resim dosyaları dır.
         * mp4, mpeg, -> video dosyaları
         * xls,xlsx, docx, txt, pptx -> doküman dosyaları
         * mp3, wav, iso, dmg, bat, exe -> genel diğer dosya türleri.
         *
         * İmage->
         * FullHD -> 1920*1080
         * 255,123,98;34,221,11;
         *
         */
        try{
            //dosyayaLogKaydet(new Log("com.muhammet.Runner","Main","beklenmeyen hata"));
            //dosyayaYaz("Başka bir şey yazalım");
            //throw new RuntimeException("Hataaaa oldu");
            //System.out.println(dosyadanOku());
            System.out.println(dosyadanLogOku());
        }catch (Exception exception){
            System.out.println("Beklenmeyen dosya hatası.....: "+ exception.getMessage());
        }

    }

    private static void dosyayaYaz(String yazilacakMetin) throws IOException {
        FileOutputStream file = new FileOutputStream("/Users/muhammetalikaya/BOOST_JAVA_13/JAVASE/Java13_038_Serilestirme_DosyaIslemleri/src/main/resources/deneme.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(file);
        outputStream.writeObject(yazilacakMetin);
        outputStream.close();
    }

    private static  String dosyadanOku() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("/Users/muhammetalikaya/BOOST_JAVA_13/JAVASE/Java13_038_Serilestirme_DosyaIslemleri/src/main/resources/deneme.txt");
        ObjectInputStream inputStream = new ObjectInputStream(file);
        String icerik =  (String) inputStream.readObject();
        return  icerik;
    }

    private static void dosyayaLogKaydet(Log log) throws IOException {
        FileOutputStream file = new FileOutputStream("/Users/muhammetalikaya/BOOST_JAVA_13/JAVASE/Java13_038_Serilestirme_DosyaIslemleri/src/main/resources/log.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(file);
        outputStream.writeObject(log);
        outputStream.close();
    }

    private static  Log dosyadanLogOku() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("/Users/muhammetalikaya/BOOST_JAVA_13/JAVASE/Java13_038_Serilestirme_DosyaIslemleri/src/main/resources/log.txt");
        ObjectInputStream inputStream = new ObjectInputStream(file);
        Log log = (Log)inputStream.readObject();
        return  log;
    }
}
