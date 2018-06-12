package com.rvfs.challenge.mcc.domain;

/**
 * Oauth client data.
 */
public enum OauthClientData {
        
    REGISTER_APP("register-app", "secret"),

    TRUSTED_APP("trusted-app", "secret");

    private String id;

    private String secret;

    OauthClientData(String id, String secret){
        this.id = id;
        this.secret = secret;
    }


    public String getId() {
        return id;
    }


    public String getSecret() {
        return secret;
    }

}