package com.persevere.trainerservice.controller;

import com.persevere.trainerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
}
