package com.yhao.exception;

public class EasonException extends Exception {
    private String errorCode;

    public EasonException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
