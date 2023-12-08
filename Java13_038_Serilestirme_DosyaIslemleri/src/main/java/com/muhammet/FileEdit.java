package com.muhammet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class FileEdit<T> {

    public void write(T clazz, String fileName){
        try{
            FileOutputStream out = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(out);
            objectOut.writeObject(clazz);
            objectOut.close();
        }catch (Exception ex){
            System.out.println("Beklenmeyen hata....: "+ ex);
        }
    }

    public Optional<T> read(String fileName){
        try{
            FileInputStream inn = new FileInputStream(fileName);
            ObjectInputStream objectInn = new ObjectInputStream(inn);
            T t =  (T)objectInn.readObject();
            return Optional.of(t);
        }catch (Exception exception){
            System.out.println("Beklenmeyen okuma hatası...: "+ exception);
            return Optional.empty();
        }
    }
}
