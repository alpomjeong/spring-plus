package org.example.expert.domain.auth.dto.response;

import lombok.Getter;

@Getter
public class SigninResponse {

    private final String bearerToken;
    private final String nickName;

    public SigninResponse(String bearerToken, String nickName) {
        this.bearerToken = bearerToken;
        this.nickName = nickName;
    }
}
