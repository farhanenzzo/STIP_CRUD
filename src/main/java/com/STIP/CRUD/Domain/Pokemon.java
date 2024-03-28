package com.STIP.CRUD.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String type;
    private int level;
    private String species;
    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    public Pokemon() {
    }

    public Pokemon(long id, String name, String type, int level, String species, Trainer trainer) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.species = species;
        this.trainer = trainer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", species='" + species + '\'' +
                ", trainer=" + trainer +
                '}';
    }
}
