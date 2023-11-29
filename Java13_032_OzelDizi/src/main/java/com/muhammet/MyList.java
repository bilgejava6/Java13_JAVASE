package com.muhammet;

public class MyList<T> {

    private T[] dizi;
    private int size=0;

    public void add(T value){
        if(size==0){
            //dizi = new T[1];
            dizi[0] = value;
            size++;
        }else {
            T[] tmp = dizi;
            //dizi = new T[++size];
            for(int i=0;i<tmp.length;i++)
                dizi[i] = tmp[i];
            dizi[size-1] = value;
        }
    }

    public T[] getDizi(){
        return dizi;
    }
    
}
