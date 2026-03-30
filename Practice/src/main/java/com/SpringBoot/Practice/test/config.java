package com.SpringBoot.Practice.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public EmailSender emailSender() {
        return new EmailSender("Gmail");
    }

    @Bean
    public CallMeForTesting callMeForTesting() {
        return new CallMeForTesting();
    }

}
