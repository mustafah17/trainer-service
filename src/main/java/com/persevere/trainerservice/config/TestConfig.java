package com.persevere.trainerservice.config;

import com.persevere.trainerservice.TrainerServiceApplication;
import com.persevere.trainerservice.model.Customer;
import com.persevere.trainerservice.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local")
@Configuration
public class TestConfig {

    private static final Logger log = LoggerFactory.getLogger(TestConfig.class);

    public TestConfig (CustomerRepository repository) {

        repository.saveAndFlush(new Customer(1L, "User1", "Pass"));
        repository.saveAndFlush(new Customer(2L, "User2", "Pass"));
        repository.saveAndFlush(new Customer(3L, "User3", "Pass"));

        for (Customer customer : repository.findAll()) {
            System.out.println(customer.toString());
        }
    }
}
