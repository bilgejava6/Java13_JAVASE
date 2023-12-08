package com.muhammet;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Runner_FileProperties {
    private final static String PATH1 = "/Users/muhammetalikaya/BOOST_JAVA_13/JAVASE/Java13_038_Serilestirme_DosyaIslemleri/src/main/resources/log.txt";
    private final static String PATH2 = "/Users/muhammetalikaya/BOOST_JAVA_13/JAVASE/Java13_038_Serilestirme_DosyaIslemleri/src/main/resources/string.txt";
    private final static String PATH3 = "";
    public static void main(String[] args) {
        /***
         * File, Files
         */

        File file = new File(PATH1);
        File file2 = new File(PATH2);

        System.out.println("Dosya mevcut mudur?......: "+ file.exists());
        System.out.println("Dosaynın tam konumu......: "+ file.getAbsolutePath());
        System.out.println("Dosyanını adı............: "+ file.getName());
        System.out.println("Dosyanın bulunduğu konum.: "+ file.getParent());
        System.out.println("Dosyanın bulunduğu konum.: "+ file.getParentFile());
        System.out.println("bu bir Dosya mıdır.......: "+ file.isFile());
        System.out.println("Dosyanın boyutu..........: "+ file.length());
        System.out.println("Dosyanın boyutu2.........: "+ file2.length());
        System.out.println("Son değiştirilme tarihi..: "+ file.lastModified());
        // file.setLastModified() // son değiştirilme tarihini değiştir.
        // file.setReadable()
        // file.setWritable()
        // bazı dosyalar internetten inidirildiğinde değiştirilmeye kapalı gelebilir.
        // bunu değiştirmek için kullanırız.
        Path path = Path.of(PATH3);
        System.out.println("Dosya var mı.............: " + Files.exists(path));
        /**
         * delete -> dosya var ise siler, yok ise hata fırlatır. dönüş tipi void dir.
         * deleteIf -> dosya var ise siler yok ise hata fırlatmaz ve sildiğinde true döner.
         */
        try{
            Files.delete(path);
        } catch (IOException exception){
            System.out.println("delete Beklenmeyen hata.....: "+exception);
        }

        try{
            Files.deleteIfExists(path);
        }catch (Exception exception){
            System.out.println("deleteIf Beklenmeyen hata.....: "+ exception);
        }

        Path path1 = Path.of(PATH2);
        try{
            Files.copy(path1,Path.of("/Users/muhammetalikaya/BOOST_JAVA_13/test/kopyalanan.xlsx"), StandardCopyOption.REPLACE_EXISTING);
            Files.move(path1,Path.of("/Users/muhammetalikaya/BOOST_JAVA_13/test/kopyalanan.docx"));
        }catch (Exception exception){
            System.out.println("Hata...: "+exception);
        }




    }
}
