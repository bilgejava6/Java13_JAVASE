package com.muhammet.benimozelistisnalarim;

public class BenimUserException extends RuntimeException{

    public BenimUserException(String hataMesajinNedir){
        super(hataMesajinNedir);
    }
}
