package com.muhammet;

public class Runner_Uygulamalarin_Calisma_Suresi_Performans {
    public static void main(String[] args) {
        /**
         * Kodlmalarınızı yaparken kodların işletim süreleri performansı görmek için bir kriterdir,
         * kullanıcı deneyimini direkt etkileyen temel konulardan birisidir.
         * Buradaki işlemde olan aşamalar;
         * 1- String pool içinde her işlem sonunda yeni nesne yaratılarak String değeri atanır.
         * 2- Belli bir süre sonra kullanılmayan String değerleri yani bir adres tarafından işaret edilmeyen
         * bellek alanları GC(Garbage Collector) tarafından toplanır(temizlenir)
         * 3- işlem sonuna kadar böyle devam eder.
         * Burada yapılan işlemler çok fazla işlemci ve bellek yükü getirdiği için işlem uzun sürer.
         */
        long start = System.currentTimeMillis();
        String ifade = "Asus Laptop AAA434X";
        int kullanici_sayisi= 100_000;
        for(int i=0;i<kullanici_sayisi;i++){
            ifade = ifade + i; // Asus Laptop AAA434X0 ->>  Asus Laptop AAA434X01 ->> Asus Laptop AAA434X012
        }
        long end = System.currentTimeMillis();
        System.out.println("işlem süresi.....: "+ (end-start)+" ms");

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Asus Laptop AAA434X");
        kullanici_sayisi = 1_000_000;
        for(int i=0;i<kullanici_sayisi;i++){
            sb.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("işlem süresi.....: "+ (end-start)+" ms");

    }
}
