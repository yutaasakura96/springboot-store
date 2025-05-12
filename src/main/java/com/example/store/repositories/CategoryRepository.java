package com.example.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.store.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}
