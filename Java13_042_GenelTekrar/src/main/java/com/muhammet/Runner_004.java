package com.muhammet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner_004 {
    public static void main(String[] args) {
        Map<String, List<String>> uygulamaListesi = new HashMap<>();
        uygulamaListesi.put("MSWord",List.of("doc","docx","txt"));
        uygulamaListesi.put("PhotoShop",List.of("jpg","png","jpeg","ico"));
        uygulamaListesi.put("Excel",List.of("cvs","xls","xlsx"));

        String ifade = "uygulama resmi.png, profil fotoğrafı.jpg, cv.doc";
        String[] dosyalar = ifade.split(",");

        for (String dosya: dosyalar){
            int nokta = dosya.lastIndexOf(".");
            String dosyaAdi = dosya.substring(0,nokta);
            String uzanti = dosya.substring(nokta+1);
            uygulamaListesi.forEach((k,v)->{
                if(v.stream().anyMatch(x->x.equals(uzanti))){
                    System.out.println(dosyaAdi+ " "+ k+ " Uygulaması ile açılır.");
                }
            });
        }

    }
}
