package com.example.store.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import com.example.store.dtos.RegisterUserRequest;
import com.example.store.dtos.UpdateUserRequest;
import com.example.store.dtos.UserDto;
import com.example.store.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
