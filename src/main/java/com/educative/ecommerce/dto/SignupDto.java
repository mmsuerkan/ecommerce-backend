package com.educative.ecommerce.dto;

import lombok.Data;

@Data
public class SignupDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
