package com.STIP.CRUD.Repository;

import com.STIP.CRUD.Domain.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
