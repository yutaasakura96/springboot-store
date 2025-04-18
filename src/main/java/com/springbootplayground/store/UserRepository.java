package com.springbootplayground.store;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
