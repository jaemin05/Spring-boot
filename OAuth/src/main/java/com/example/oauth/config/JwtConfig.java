package com.example.oauth.config;

import com.example.oauth.security.token.AuthToken;
import com.example.oauth.security.token.TokenProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {
    @Value("jwt.secret")
    private String secret;

    @Bean
    public TokenProvider jwtProvider(){
        return new TokenProvider(secret);
    }
}
