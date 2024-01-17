package com.register.users.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
public class User2 {

    private static final String UUID_GENERATOR_STRATEGY = "org.hibernate.id.UUIDGenerator";

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = UUID_GENERATOR_STRATEGY)
    private String id;

    private String user;
    private String gender;
    private String name;
    private String surname;
    private String mail;
    private int phone;
}
