    package com.register.users.repository;
    import com.register.users.model.UserModel;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface UserRepository extends JpaRepository<UserModel, Long> {


    }
