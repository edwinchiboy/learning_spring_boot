package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
public class CurrencyServiceConfiguration {
    private String url;


    private String userName;
    private String key;

    public CurrencyServiceConfiguration(String url, String userName, String key) {
        this.url = url;
        this.userName = userName;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public void setKey(final String key) {
        this.key = key;
    }


}
