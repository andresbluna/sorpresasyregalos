package com.register.users.controller;

import com.register.users.model.User;
import com.register.users.repository.UserRepository;
import com.register.users.service.UserService;
import com.register.users.utils.Exceptions;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class Controller {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;
    }

@PostMapping
public ResponseEntity<?> createUser(@Valid @RequestBody User user) {
    User createdUser = userService.createUser(user);

    // Devuelve el usuario creado y el estado HTTP 201 - Created
    return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
}

}
