package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.store.entities.User;
import com.example.store.repositories.UserRepository;
import com.example.store.services.UserService;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var service =  context.getBean(UserService.class);
        service.fetchAddress();

    }
}
