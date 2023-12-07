package com.muhammet.benimozelistisnalarim;

public class BenimUserException extends RuntimeException{
    private final ErrorType errorType;

    public BenimUserException(ErrorType errorType){
        super(errorType.getCode()+" : "+errorType.getMessage());
        this.errorType = errorType;
    }

    public BenimUserException(ErrorType errorType, String message){
        super(errorType.getCode()+" : "+message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
