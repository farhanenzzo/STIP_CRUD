package com.STIP.CRUD.Controller;

import com.STIP.CRUD.Domain.Pokemon;
import com.STIP.CRUD.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;

    @PostMapping()
    public String createPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.savePokemon(pokemon);
        return "New Pokemon Has Been Saved";
    }

    @GetMapping()
    public List<Pokemon> getAllPokemons() {
        return pokemonService.fetchAllPokemons();
    }

    @GetMapping("/{pokemonId}")
    public Optional<Pokemon> getPokemonById(@PathVariable long pokemonId) {
        return pokemonService.fetchPokemonById(pokemonId);
    }
    @DeleteMapping("/{pokemonId}")
    public String removePokemonById(@PathVariable long pokemonId) {
        pokemonService.deletePokemonById(pokemonId);
        return "Pokemon has been deleted";
    }

    @PostMapping("/{pokemonId}")
    public String editPokemonById(@PathVariable long pokemonId, @RequestBody Pokemon pokemon) {
        pokemonService.updatePokemonById(pokemonId, pokemon);
        return "Pokemon has been updated";
    }
}
