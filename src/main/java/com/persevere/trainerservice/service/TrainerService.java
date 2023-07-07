package com.persevere.trainerservice.service;

import com.persevere.trainerservice.model.Trainer;

import java.util.List;

public interface TrainerService {

    // READ
    List<Trainer> findAll();
    Trainer getTrainer(Long id);

    // CREATE
    Trainer create(Trainer trainer);

    // UPDATE
    Trainer update(Long id, Trainer updatedTrainer);

    // DELETE
    void delete(Long id);

}
