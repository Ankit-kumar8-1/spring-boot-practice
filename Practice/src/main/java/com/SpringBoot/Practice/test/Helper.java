package com.SpringBoot.Practice.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Helper {

    @Autowired
    private Hello caHello;

    public void callHello() {
        String message = caHello.hello();
        System.out.println(message);
    }

}
