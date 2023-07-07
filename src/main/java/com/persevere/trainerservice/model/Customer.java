package com.persevere.trainerservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "customer")
public class Customer {

    @Id
    private Long id;
    private String username;
    private String password;

    public Customer(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Customer() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
