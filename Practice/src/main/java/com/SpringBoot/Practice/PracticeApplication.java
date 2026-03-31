package com.SpringBoot.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringBoot.Practice.Test.DataBasesService;
import com.SpringBoot.Practice.Test.EmailSender;
import com.SpringBoot.Practice.Test.Report;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticeApplication.class, args);

		EmailSender emailSender = context.getBean(EmailSender.class);
		emailSender.sendEmail();

		EmailSender emailSender2 = context.getBean(EmailSender.class);

		System.out.println("emailSender and emailSender2 are the same instance : " + (emailSender == emailSender2));
		System.out.println("emailsender hashcode : " + emailSender.hashCode());
		System.out.println("emailSender2 hashcode : " + emailSender2.hashCode());

		Report report = context.getBean(Report.class);
		Report report2 = context.getBean(Report.class);

		System.out.println("report and report2 are the same instance : " + (report == report2));
		System.out.println("report hashcode  : " + report.hashCode());
		System.out.println("report2 hashcode : " + report2.hashCode());

		DataBasesService dataBasesService = context.getBean(DataBasesService.class);
		dataBasesService.queryDatabase();

		((ConfigurableApplicationContext) context).close();

	}
}
