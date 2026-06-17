package com.github.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
    JWT - Gerar o Token e validação do Token
    Um token JWT possui 3 partes que são separadas por ponto
    HEADERS.PAYLOAD.SIGNATURE
        - HEADERS -> tipo do token (jwt) e um algoritmo de assinatura (HS256)
        - PAYLOAD -> dados(claims) - username, ROLE.
        - SIGNATURE -> assinatura com a chav secreta - que garante que ninguém adulterou o token - precisa ser criado por você
*/

@Component
public class JwtUtil {
    
    @Value("${jwt.secret}")
    private String secret;

}
