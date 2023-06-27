package com.dedalus.eqpmgmt.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {

    private String token;

    public JwtAuthenticationToken(Object principal, String token) {
        super(principal, null);
        this.token = token;
    }

    public JwtAuthenticationToken(Object principal, String token, Collection<? extends GrantedAuthority> authorities) {
        super(principal, null, authorities);
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}

