package com.persevere.trainerservice.service;

import com.persevere.trainerservice.model.Customer;

import java.util.List;

public interface CustomerService {
    // READ
    List<Customer> findAll();
    Customer getCustomer(Long id);

    // CREATE
    Customer create(Customer customer);

    // UPDATE
    Customer update(Long id, Customer updatedCustomer);

    // DELETE
    void delete(Long id);
}
