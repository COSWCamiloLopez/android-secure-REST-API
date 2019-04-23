package com.eci.cosw.taskplanner;

public class Token {

    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString(){
        return "Token: " + accessToken;
    }
}
