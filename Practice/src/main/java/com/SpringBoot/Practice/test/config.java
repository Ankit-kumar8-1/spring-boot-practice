package com.SpringBoot.Practice.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Value("${app.email.provider}")
    private String emailProvider;

    @Bean
    public EmailSender emailSender() {
        return new EmailSender(emailProvider);
    }

    @Bean
    public CallMeForTesting callMeForTesting() {
        return new CallMeForTesting();
    }

}
