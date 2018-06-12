package com.rvfs.challenge.mcc.domain;

public enum OauthGrantTypes {

    CLIENT_CREDENTIALS("client_credentials"),

    PASSWORD("password");

    private String type;

    OauthGrantTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
