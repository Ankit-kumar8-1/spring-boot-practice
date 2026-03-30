package com.SpringBoot.Practice.test;

public class EmailSender {
    public String emailProvider;

    public EmailSender(String emailProvider) {
        this.emailProvider = emailProvider;
    }

    public String sendEmail() {
        return "Email sent using " + emailProvider;
    }

}
