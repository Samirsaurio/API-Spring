package com.example.ecommercebackend.api.model;

public class LoginResponse {

    public String jwt;

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
