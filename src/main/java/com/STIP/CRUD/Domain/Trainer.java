package com.STIP.CRUD.Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "trainer")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String badge;
    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pokemon> pokemons;

    @ManyToMany(mappedBy = "trainers")
    private List<Gym> gyms;

    public Trainer() {
    }

    public Trainer(long id, String name, String badge, List<Pokemon> pokemons, List<Gym> gyms) {
        this.id = id;
        this.name = name;
        this.badge = badge;
        this.pokemons = pokemons;
        this.gyms = gyms;
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

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Gym> getGyms() {
        return gyms;
    }

    public void setGyms(List<Gym> gyms) {
        this.gyms = gyms;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", badge='" + badge + '\'' +
                ", pokemons=" + pokemons +
                ", gyms=" + gyms +
                '}';
    }
}
