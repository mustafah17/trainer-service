package com.persevere.trainerservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "customer")
public class Customer {

    @Id
    private Long id;
    private String username;
    private String password;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
