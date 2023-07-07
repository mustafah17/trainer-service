package com.persevere.trainerservice.service;

import com.persevere.trainerservice.model.Customer;
import com.persevere.trainerservice.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {this.customerRepository = customerRepository;}

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long id) {
        return customerRepository.getReferenceById(id);
    }

    public Customer create(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    public Customer update(Long id, Customer updatedCustomer) {
        // TODO: add validation that all attributed are passed in, otherwise return 400 bad payload
        Customer existingCustomer = customerRepository.getReferenceById(id);
        BeanUtils.copyProperties(updatedCustomer, existingCustomer, "id");
        return customerRepository.saveAndFlush(existingCustomer);
    }

    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
