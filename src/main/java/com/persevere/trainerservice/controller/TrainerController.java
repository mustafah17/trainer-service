package com.persevere.trainerservice.controller;

import com.persevere.trainerservice.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/trainer")
public class TrainerController {

    @Autowired
    private TrainerRepository trainerRepository;


}
