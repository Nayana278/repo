
package com.example.Springboothelloworld.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
    private LocalDateTime createdOn;
    private String phoneNumber;
    private String password;


}

