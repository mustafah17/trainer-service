package com.persevere.trainerservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainerServiceApplication {

    private static final Logger log = LoggerFactory.getLogger(TrainerServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TrainerServiceApplication.class, args);
    }
}
