package com.SpringBoot.Practice.Test;

import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    private final AppProperties appConfig;

    public EmailSender(AppProperties appConfig) {
        this.appConfig = appConfig;
    }

    public void sendEmail() {
        System.out.println("Sending email using provider: " + appConfig.getProvider());
        System.out.println("Email message: " + appConfig.getMessage());
    }
}
