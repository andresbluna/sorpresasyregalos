package com.register.users.controller;

import com.register.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class Controller {
    @Autowired
    private UserRepository userRepository;

    // Create operation
    @PostMapping("myEntity")
    public MyEntity createMyEntity(@Valid @RequestBody MyEntity myEntity)
    {
        return myEntityRepository.save(myEntity);
    }

    @GetMapping("myEntity")
    public List<MyEntity> getAllMyEntities() {
        return myEntityRepository.findAll();
    }

    // Update operation
    @PutMapping("myEntity/{id}")
    public ResponseEntity<MyEntity> updateMyEntity(@PathVariable(value = "id") Long myEntityId,
                                                   @Valid @RequestBody MyEntity myEntityDetails) {
        MyEntity myEntity = myEntityRepository.findById(myEntityId)
                .orElseThrow(() -> new ResourceNotFoundException("MyEntity", "id", myEntityId));

        // Update the fields of myEntity using the fields from myEntityDetails

        MyEntity updatedEntity = myEntityRepository.save(myEntity);
        return ResponseEntity.ok(updatedEntity);
    }

}
