 package com.example.timetracker.service;

import com.example.timetracker.model.User;
import com.example.timetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
