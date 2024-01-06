package com.register.users.repository;

import com.register.users.model.User;
import io.micrometer.observation.ObservationFilter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private EntityManager entityManager;

    public UserRepository() {
        entityManager = Persistence.createEntityManagerFactory
                ("userPersistenceUnit").createEntityManager();
    }

    public User save(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        return user;
    }

    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }
}
