package com.SpringBoot.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringBoot.Practice.test.CallMeForTesting;
import com.SpringBoot.Practice.test.EmailSender;
import com.SpringBoot.Practice.test.Hello;
import com.SpringBoot.Practice.test.Helper;
import com.SpringBoot.Practice.test.OrderService;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PracticeApplication.class, args);

		Helper helper = context.getBean(Helper.class);
		helper.callHello();

		EmailSender sender = context.getBean(EmailSender.class);
		System.out.println(sender.sendEmail());

		Hello h = context.getBean(Hello.class);
		System.out.println(h.hello());

		CallMeForTesting callMeForTesting = context.getBean(CallMeForTesting.class);
		System.out.println(callMeForTesting.callMe());

		OrderService service = context.getBean(OrderService.class);
		System.out.println(service.placeOrder());
	}
}
