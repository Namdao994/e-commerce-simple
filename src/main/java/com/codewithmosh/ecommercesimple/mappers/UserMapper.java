package com.codewithmosh.ecommercesimple.mappers;

import com.codewithmosh.ecommercesimple.dtos.RegisterUserRequest;
import com.codewithmosh.ecommercesimple.dtos.UserDto;
import com.codewithmosh.ecommercesimple.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
}
