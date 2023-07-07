package com.persevere.trainerservice.web;

import com.persevere.trainerservice.model.Customer;
import com.persevere.trainerservice.repository.CustomerRepository;
import com.persevere.trainerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> list() {
        return customerService.findAll();
    }

    @GetMapping("{id}")
    public Customer get(@PathVariable Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @PutMapping("{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.update(id, customer);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        customerService.delete(id);
    }
}
