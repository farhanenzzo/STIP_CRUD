package com.STIP.CRUD.Repository;


import com.STIP.CRUD.Domain.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
