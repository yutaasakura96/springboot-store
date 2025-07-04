package com.example.store.mappers;

import com.example.store.dtos.RegisterUserRequest;
import org.mapstruct.Mapper;

import com.example.store.dtos.UserDto;
import com.example.store.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
}
