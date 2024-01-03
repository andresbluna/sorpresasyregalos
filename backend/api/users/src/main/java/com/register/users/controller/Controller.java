package com.register.users.controller;

import com.register.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class Controller {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    private AllExceptionHandler allExceptionHandler;

    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody User user) {
        if (userService.isEmailRegistered(user.getEmail())) {
            return new ResponseEntity<>(Collections.singletonMap("error01",
                    "El correo ya esta registrado en el Banco BCI, por favor intente con uno diferente"),
                    HttpStatus.BAD_REQUEST);
        }
        user.setUuid(UUID.randomUUID().toString());
        LocalDateTime now = LocalDateTime.now();
        user.setCreated(now);
        user.setModified(now);
        user.setLastLogin(now);
        user.setActive(true);
        String token = TokenG.generateNewToken(user);
        user.setToken(token);
        User createdUser = userService.createuser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public User getUser(@RequestHeader("Authorization") String token) {
        UserDetails userDetails = (UserDetails)
                SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userRepository.findByName(userDetails.getUsername());
        if (!user.getToken().equals(token)) {
            throw new IllegalArgumentException("El token no coincide con el token del usuario");
        }

        return user;
    }


}
