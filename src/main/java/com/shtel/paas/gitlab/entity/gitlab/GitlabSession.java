package com.shtel.paas.gitlab.entity.gitlab;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabSession {

    public static final String URL = "/session";

    @JsonProperty("private_token")
    private String privateToken;

    public String getPrivateToken() {
        return privateToken;
    }

    public void setPrivateToken(String privateToken) {
        this.privateToken = privateToken;
    }

}
