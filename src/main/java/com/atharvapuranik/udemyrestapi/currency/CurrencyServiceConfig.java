package com.atharvapuranik.udemyrestapi.currency;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "currency-value")
@Component
public class CurrencyServiceConfig {

    public String username;
    public String password;

    public CurrencyServiceConfig(){}

    public CurrencyServiceConfig(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
