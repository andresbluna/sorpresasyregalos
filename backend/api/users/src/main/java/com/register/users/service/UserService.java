package com.register.users.service;
import com.register.users.model.UserModel;
import com.register.users.repository.UserRepository;
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

    public UserModel createUser (UserModel user) {

        if (user != null){
            userRepository.save(user);
        }
        return createUser(user);

    }


    public UserModel updateUser (UserModel user) {

        if (user != null) {
        }
        return updateUser(user);
    }
}
