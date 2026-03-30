package com.SpringBoot.Practice.test;

import org.springframework.core.annotation.Order;

public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService(new PaymentService());
        String result = orderService.placeOrder();
        System.out.println(result);
    }
}
