package com.register.users.repository;

import com.register.users.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

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
}
