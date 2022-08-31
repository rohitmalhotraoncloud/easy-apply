package com.example.easyapply;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    private static String authKey;

    public FeignConfig(@Value("${easyApply.auth.key}") String authKey) {
        this.authKey = authKey;
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Content-Type", "application/json");
            requestTemplate.header("x-api-key", authKey);
        };
    }
}
