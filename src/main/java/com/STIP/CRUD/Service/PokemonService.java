package com.STIP.CRUD.Service;

import com.STIP.CRUD.Domain.Pokemon;
import com.STIP.CRUD.Repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepository;

    public void savePokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    public List<Pokemon> fetchAllPokemons() {
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> fetchPokemonById(long pokemonId) {
        return pokemonRepository.findById(pokemonId);
    }

    public void deletePokemonById(long pokemonId) {
        pokemonRepository.deleteById(pokemonId);
    }

    public void updatePokemonById(long pokemonId, Pokemon pokemon) {
        Optional<Pokemon> existingPokemon = pokemonRepository.findById(pokemonId);
        if (existingPokemon.isPresent()) {
            Pokemon updatePokemon = existingPokemon.get();

            updatePokemon.setName(pokemon.getName());
            updatePokemon.setType(pokemon.getType());
            updatePokemon.setLevel(pokemon.getLevel());
            updatePokemon.setSpecies(pokemon.getSpecies());
            pokemonRepository.save(updatePokemon);
        }
    }
}
