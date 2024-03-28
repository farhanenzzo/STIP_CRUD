package com.STIP.CRUD.Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "gym")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany
    private List<Trainer> trainers;

    public Gym() {
    }

    public Gym(long id, String name, List<Trainer> trainers) {
        this.id = id;
        this.name = name;
        this.trainers = trainers;
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

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trainers=" + trainers +
                '}';
    }
}
