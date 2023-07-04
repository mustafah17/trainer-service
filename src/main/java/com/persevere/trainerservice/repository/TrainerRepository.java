package com.persevere.trainerservice.repository;

import com.persevere.trainerservice.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
