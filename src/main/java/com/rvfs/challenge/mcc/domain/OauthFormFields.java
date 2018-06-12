package com.rvfs.challenge.mcc.domain;

/**
 * Oauth Form Fields.
 */
public enum OauthFormFields {

    GRANT_TYPE("grant_type"),
    CLIENT_ID("client_id"),
    PASSWORD("password"),
    USERNAME("username");

    private String name;

    OauthFormFields(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
