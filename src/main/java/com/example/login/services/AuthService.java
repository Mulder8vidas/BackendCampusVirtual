package com.example.login.services;

import com.example.login.entity.AuthRepository;
import com.example.login.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {


    private final AuthRepository authRepository;


    @Autowired
    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public Response login(String username,String password){


        return this.authRepository.findAll().stream().filter(a-> a.getUsername().equalsIgnoreCase(username) && a.getPassword().equalsIgnoreCase(password)).toList().size()>0 ? new Response("Usuario Logeado"): new Response("Usuario o clave incorrectas");



    }
}
