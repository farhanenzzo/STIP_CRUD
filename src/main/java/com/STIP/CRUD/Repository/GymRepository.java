package com.STIP.CRUD.Repository;

import com.STIP.CRUD.Domain.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<Gym, Long> {
}
