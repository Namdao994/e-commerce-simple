package com.codewithmosh.ecommercesimple.dtos;

import lombok.Data;

@Data
public class UpdateUserRequest {
    public String name;
    public String email;
}
