package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.store.repositories.UserRepository;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
       var repository = context.getBean("userRepository", UserRepository.class);
       repository.deleteById(1L);
    }

}
