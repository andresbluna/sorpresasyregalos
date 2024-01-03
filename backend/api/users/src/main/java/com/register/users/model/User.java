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
    private String city;
    private String address;
    private String user;
    private String mail;
    private int phone;
    private int numberhome;

    public User(String id, String city, String address, String user, String mail, int phone, int numberhome) {
        this.id = id;
        this.city = city;
        this.address = address;
        this.user = user;
        this.mail = mail;
        this.phone = phone;
        this.numberhome = numberhome;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getNumberhome() {
        return numberhome;
    }

    public void setNumberhome(int numberhome) {
        this.numberhome = numberhome;
    }
}