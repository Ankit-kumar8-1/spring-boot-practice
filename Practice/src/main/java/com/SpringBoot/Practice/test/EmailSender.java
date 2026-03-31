package com.SpringBoot.Practice.test;

import org.springframework.beans.factory.annotation.Value;

public class EmailSender {
    public String emailProvider;

    @Value("${app.email.message}")
    public String emailMessage;

    public EmailSender(String emailProvider) {
        this.emailProvider = emailProvider;
    }

    public String sendEmail() {
        return "Email sent using " + emailProvider + " with message: " + emailMessage;
    }

}
