package com.example.login.controller;

import com.example.login.models.LoginDO;
import com.example.login.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "*")
public class AuthController {


    private final AuthService authService;


    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "*")
    public ResponseEntity<?> login(@RequestBody LoginDO loginDO){


        return ResponseEntity.ok(this.authService.login(loginDO.getUsername(),loginDO.getPassword()));



    }
}
