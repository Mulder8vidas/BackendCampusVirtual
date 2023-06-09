package com.example.login.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "auth")
@Getter
@Setter
public class AuthEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username",length = 100 )
    private String username;

    private String password;


}
