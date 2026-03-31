package com.SpringBoot.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.Practice.Test.EmailSender;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticeApplication.class, args);

		EmailSender emailSender = context.getBean(EmailSender.class);
		emailSender.sendEmail();
	}
}
