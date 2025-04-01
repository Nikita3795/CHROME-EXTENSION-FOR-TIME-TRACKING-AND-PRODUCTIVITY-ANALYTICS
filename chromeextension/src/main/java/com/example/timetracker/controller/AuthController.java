package com.example.timetracker.controller;


import com.example.timetracker.model.User;
import com.example.timetracker.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AuthService authService;

    

    @GetMapping("/user/{email}")
    public User getUser(@PathVariable String email) {
        return authService.findByEmail(email).orElse(null);
    }
}
