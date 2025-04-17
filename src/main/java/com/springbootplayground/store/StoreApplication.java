package com.springbootplayground.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// SpringApplication.run(StoreApplication.class, args);
    var OrderService = new OrderService(new PaypalPaymentService());
    OrderService.placeorder();
	}
}
