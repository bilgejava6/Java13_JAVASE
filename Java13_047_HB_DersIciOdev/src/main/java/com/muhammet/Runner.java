package com.muhammet;

import com.muhammet.entity.Kullanici;
import com.muhammet.utility.enums.CreateRepoImpl;

public class Runner {
    public static void main(String[] args) {

        new CreateRepoImpl().createDemoData();

    }
}
