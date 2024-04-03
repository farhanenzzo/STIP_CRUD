package com.STIP.CRUD.Dto;

public class PokemonResponseDto {
    private String name;
    private String type;
    private int level;
    private String species;
    private String trainerName;

    public PokemonResponseDto() {
    }

    public PokemonResponseDto(String name, String type, int level, String species, String trainerName) {
        this();

        this.name = name;
        this.type = type;
        this.level = level;
        this.species = species;
        this.trainerName = trainerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }
}
