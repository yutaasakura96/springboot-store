package com.example.store;

import com.example.store.entities.User;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.store.entities.Address;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder().name("John").password("password").email("john@example.com").build();

        var address = Address.builder()
                .street("street")
                .city("city")
                .state("state")
                .zip("zip")
                .build();

        user.addAddress(address);
        System.out.println(user);
    }
}
