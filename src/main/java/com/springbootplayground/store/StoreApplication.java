package com.springbootplayground.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var OrderService = context.getBean(OrderService.class);
        var OrderService2 = context.getBean(OrderService.class);
        OrderService.placeOrder();
        context.close();
    }
}
