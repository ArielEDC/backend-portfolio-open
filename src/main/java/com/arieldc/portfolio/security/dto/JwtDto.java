
package com.arieldc.portfolio.security.dto;

public class JwtDto {
    private String token;
    /*
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authorities;
    */

    public JwtDto(String token) {
        this.token = token;

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}