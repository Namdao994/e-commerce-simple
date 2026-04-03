package com.codewithmosh.ecommercesimple.mappers;

import com.codewithmosh.ecommercesimple.dtos.RegisterUserRequest;
import com.codewithmosh.ecommercesimple.dtos.UpdateUserRequest;
import com.codewithmosh.ecommercesimple.dtos.UserDto;
import com.codewithmosh.ecommercesimple.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
