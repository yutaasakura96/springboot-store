package com.example.store.services;

import org.springframework.stereotype.Service;

import com.example.store.entities.User;
import com.example.store.repositories.UserRepository;

import jakarta.persistence.EntityManager;

import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service

public class UserService {
    private final UserRepository userRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityStates() {
        var user = User.builder().name("John").email("john@email.com").password("password")
                .build();

        if (entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient / Detached");
        }

        userRepository.save(user);

        if (entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient / Detached");
        }
    }
}
