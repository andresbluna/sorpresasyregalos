package com.register.users.service;

import com.register.users.model.User;
import com.register.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        // Aquí puedes agregar alguna lógica de validación de datos antes de guardar el usuario en la base de datos

        // llama a save() del repositorio para almacenar el usuario en la base de datos
        return userRepository.save(user);
    }
    public User updateUser(Long id, User newUser) {
        return userRepository.findById(id)
                .map(user -> {
                    // Aquí estableces todos los campos del usuario existente con los del nuevo usuario
                    user.setName(newUser.getName());  // Suponiendo que tenga un campo llamado "name"
                    // Agrega aquí todos los demás campos del usuario
                    return userRepository.save(user);
                })
                .orElseThrow(() -> new NotFoundException("User not found with id " + id));
    }


    }
public User getUser(Long id) {
    if (userRepository.existsById(id)) {
        return userRepository.findById(id).orElse(null);
    } else {
        throw new NotFoundException("User not found with id " + id);
    }
}


}
