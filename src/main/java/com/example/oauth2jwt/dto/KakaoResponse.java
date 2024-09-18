package com.example.oauth2jwt.dto;

import java.util.Map;

public class KakaoResponse implements OAuth2Response{
    private final Map<String, Object> attribute;
    public KakaoResponse(Map<String, Object> attribute) {
        this.attribute = attribute;
    }
    @Override
    public String getProvider() {
        return "kakao";
    }

    @Override
    public String getProviderId() {
        return attribute.get("id").toString();
    }

    @Override
    public String getEmail() {
        return attribute.get("kakao_account").toString();
    }

    @Override
    public String getName() {
        return ((Map<String, Object>) attribute.get("properties")).get("nickname").toString();
    }
}
