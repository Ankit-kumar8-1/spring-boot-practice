package com.SpringBoot.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.Practice.test.Helper;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticeApplication.class, args);

		Helper helper = context.getBean(Helper.class);
		helper.callHello();

	}
}
