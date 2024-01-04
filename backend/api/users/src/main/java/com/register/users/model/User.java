package com.register.users.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
public class User {
    private static final String
            UUID_GENERATOR_STRATEGY = "org.hibernate.id.UUIDGenerator";

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = UUID_GENERATOR_STRATEGY)
    private String user;
    private String gender;
    private String name;
    private String surname;
    private String mail;
    private int phone;

    public User(String user, String gender, String name, String surname, String mail, int phone) {
        this.user = user;
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;

    }
}