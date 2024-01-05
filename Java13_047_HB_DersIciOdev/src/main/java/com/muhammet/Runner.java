package com.muhammet;

import com.muhammet.service.KullaniciService;

public class Runner {
    public static void main(String[] args) {

        new KullaniciService().getPcOnUserId(1L);

    }
}
