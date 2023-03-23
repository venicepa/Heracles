package com.yhao.enums;

public enum EasonErrorCode {

    NOT_EXISTS("01");

    String value;

    EasonErrorCode(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
