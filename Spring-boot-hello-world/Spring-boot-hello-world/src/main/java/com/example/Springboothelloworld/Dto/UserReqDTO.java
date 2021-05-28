package com.example.Springboothelloworld.Dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserReqDTO {

    private String email;
    private String name;
    private String phoneNumber;
    private String password;
    private LocalDateTime createdOn;

}
