package com.register.users.repository;

import com.register.users.models.User2;
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

    public User2 save(User2 user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        return user;
    }

    public User2 findById(Long id) {
        return entityManager.find(User2.class, id);
    }
}
