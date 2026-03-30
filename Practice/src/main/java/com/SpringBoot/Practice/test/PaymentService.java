package com.SpringBoot.Practice.test;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public String processPayment() {
        return "Payment processed successfully.";
    }
}
