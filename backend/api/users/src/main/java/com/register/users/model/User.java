package com.register.users.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
public class User {
    private static final String UUID_GENERATOR_STRATEGY = "org.hibernate.id.UUIDGenerator";

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = UUID_GENERATOR_STRATEGY)
    private String id;
    private String user;
    private String gender;
    private String name;
    private String surname;
    private String mail;
    private int phone;

    public User(String id, String city, String address, String user, String mail, int phone, int numberhome) {
        this.id = id;
        this.user = user;
        this.mail = mail;
        this.phone = phone;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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