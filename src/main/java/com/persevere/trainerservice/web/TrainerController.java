package com.persevere.trainerservice.web;

import com.persevere.trainerservice.model.Trainer;
import com.persevere.trainerservice.repository.TrainerRepository;
import com.persevere.trainerservice.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/trainer")
public class TrainerController {

    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Trainer> list() {
        return trainerService.findAll();
    }

    @GetMapping("{id}")
    public Trainer get(Long id) {
        return trainerService.getTrainer(id);
    }

    @PostMapping
    public Trainer create(Trainer trainer) {
        return trainerService.create(trainer);
    }

    @PutMapping("{id}")
    public Trainer update(@PathVariable Long id, @RequestBody Trainer trainer) {
        return trainerService.update(id, trainer);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        trainerService.delete(id);
    }
}
