package com.example.store;

import com.example.store.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        User.builder().name("John").password("password").email("john@example.com").build();
    }
}
