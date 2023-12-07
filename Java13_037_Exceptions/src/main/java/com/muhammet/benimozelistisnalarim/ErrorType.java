package com.muhammet.benimozelistisnalarim;

public enum ErrorType {
    REPOSITORY_USER_NOTFOUND(1001,"Aradığınız kullanıcı bulunamadı"),
    REPOSITORY_USER_UPDATE_ERROR(1002,"Kullanıcı güncelleme işlemi tamamlanmadı. lütfen tekrar deneyiniz"),
    REPOSITORY_USER_SAVE_ERROR(1003,"Bu kullanıcı adı önceden kayıt edilmiş");
    private int code;
    private String message;
    ErrorType(){
    }
    ErrorType(int code,String message){
        this.code = code;
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
