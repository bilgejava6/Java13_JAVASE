package com.muhammet;

public class OzelDiziSinifi {
    private String[] dizi;
    private int size=0;
    public OzelDiziSinifi(){
        /**
         * Constructor
         */
    }

    public void add(String value){
        if(size==0){
            dizi = new String[1];
            dizi[0] = value;
            size++;
        }else {
            String[] tmp = dizi;
            dizi = new String[++size];
            for(int i=0;i<tmp.length;i++)
                dizi[i] = tmp[i];
            dizi[size-1] = value;
        }
    }

    public String[] getDizi(){
        return dizi;
    }
}
