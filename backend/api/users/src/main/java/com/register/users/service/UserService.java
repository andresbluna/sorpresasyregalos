package com.register.users.service;
import com.register.users.model.User;
import com.register.users.repository.UserRepository;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser (User user) {

        if (user != null){
            userRepository.save(user);
        }
        return createUser(user);

    }


    public User updateUser (User user) {

        if (user != null) {



        }
        return updateUser(user);
    }
}
