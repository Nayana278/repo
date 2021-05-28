package com.example.Springboothelloworld.Dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserRespDTO {
    private Long id;
    private String email;
    private String name;
    private LocalDateTime createdOn;
    private String phoneNumber;
    private String password;
}
