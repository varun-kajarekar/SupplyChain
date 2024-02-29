package com.t7.supplychain.Entity;

import org.springframework.stereotype.Component;

@Component
public class ResponseEntity {

    private String token;

    private String msg;

    public ResponseEntity() {
    }

    public ResponseEntity(String token, String msg) {
        this.token = token;
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public String getMsg() {
        return msg;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "token='" + token + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
