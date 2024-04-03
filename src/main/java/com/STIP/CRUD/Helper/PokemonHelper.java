package com.STIP.CRUD.Helper;

import com.STIP.CRUD.Domain.Pokemon;
import com.STIP.CRUD.Dto.PokemonResponseDto;
import org.springframework.stereotype.Component;

@Component
public class PokemonHelper {

    public PokemonResponseDto getPokemonResponseDto(Pokemon pokemon) {
        return new PokemonResponseDto(
                pokemon.getName(),
                pokemon.getType(),
                pokemon.getLevel(),
                pokemon.getSpecies(),
                pokemon.getTrainer().getName()
        );
    }
}