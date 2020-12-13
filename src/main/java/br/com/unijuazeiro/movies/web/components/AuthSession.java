package br.com.unijuazeiro.movies.web.components;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class AuthSession implements Serializable {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    
    public boolean isAuthenticate(){
        return username != null;
    }
    
    public void logout(){
        this.username = null;
    }

}
