package com.example.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.store.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    // This interface will automatically inherit CRUD operations for User entities
    // from the CrudRepository interface.
}
