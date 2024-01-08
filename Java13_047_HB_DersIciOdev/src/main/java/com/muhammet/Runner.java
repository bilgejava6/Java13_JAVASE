package com.muhammet;

import com.muhammet.service.KullaniciService;

public class Runner {
    public static void main(String[] args) {

        /**
         *
         * Hastane RAndevu Sistemi
         * -> 10+ branş
         * -> 20+ hasta
         * -> 5+ doktor
         * -> 100+ randevu
         * ------------------------
         * hastaservice
         * ---- adı verilen hastanını randevuları
         * ---- hangi branşlarda kaç randevu almış
         * ---- belli bir tarih aralığındaki randevuları
         * doktorservice
         * ---- adı verilen doktor kaç hasta bakmış
         * ---- belli bir branşta görev yapan doktorlar kimlerdir.
         *
         * randevu -> doktor, hasta | doktor -> brans
         * 1. adım filter hastaId, kac farkı randevu almış.
         * 2. List<String> doktorIds, not tekilleştirmemelisiniz.
         * 3. doktor tablosunda List<Doktor>, groupBy -> bransId
         *
         */

        new KullaniciService().getPcOnUserId(1L);

    }
}
