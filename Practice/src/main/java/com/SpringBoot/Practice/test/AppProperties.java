package com.SpringBoot.Practice.Test;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "app.email")
public class AppProperties {

    private String provider;
    private String message;

}
