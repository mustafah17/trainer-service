package com.persevere.trainerservice.service;

import com.persevere.trainerservice.model.Trainer;
import com.persevere.trainerservice.repository.TrainerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    private TrainerRepository trainerRepository;

    @Autowired
    public TrainerServiceImpl(TrainerRepository trainerRepository) {this.trainerRepository = trainerRepository;}

    public List<Trainer> findAll() {
        return trainerRepository.findAll();
    }

    public Trainer getTrainer(Long id) {
        return trainerRepository.getReferenceById(id);
    }

    public Trainer create(Trainer trainer) {
        return trainerRepository.saveAndFlush(trainer);
    }

    public Trainer update(Long id, Trainer updatedTrainer) {
        // TODO: add validation that all attributed are passed in, otherwise return 400 bad payload
        Trainer existingTrainer = trainerRepository.getReferenceById(id);
        BeanUtils.copyProperties(updatedTrainer, existingTrainer, "id");
        return trainerRepository.saveAndFlush(existingTrainer);
    }

    public void delete(Long id) {
        trainerRepository.deleteById(id);
    }
}
