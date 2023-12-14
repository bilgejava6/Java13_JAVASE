package com.muhammet.SingletonDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MusteriRepository {

    private static MusteriRepository instance;

    public static MusteriRepository getInstance(){
        if(instance == null){
            instance = new MusteriRepository();
        }
        return instance;
    }
    private MusteriRepository(){}

    public void save(){}
    public void update(){}
    public List<String> list(){
        return new ArrayList<>();
    }

}
