package com.STIP.CRUD.Service;


import com.STIP.CRUD.DTO.GymDto;
import com.STIP.CRUD.DTO.TrainerDto;
import com.STIP.CRUD.Domain.Gym;
import com.STIP.CRUD.Domain.Trainer;
import com.STIP.CRUD.Repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {
    @Autowired
    private TrainerRepository trainerRepository;

    public void save(TrainerDto trainer) {
        Trainer tra = new Trainer();
        tra.setName(trainer.getName());
        tra.setBadge(trainer.getBadge());
        trainerRepository.save(tra);
    }

    public TrainerDto getTrainer(Long id) {
        Trainer trainer = trainerRepository.findById(id).orElseThrow();
        TrainerDto trainerDto = new TrainerDto();
        trainerDto.setName(trainer.getName());
        trainerDto.setBadge(trainer.getBadge());
        return trainerDto;
    }

    public Trainer updateTrainer(Long id, TrainerDto trainerDto) {
        Trainer exitTrainer = trainerRepository.findById(id).orElseThrow();
        exitTrainer.setName(trainerDto.getName());
        //exitTrainer.setBadge(trainerDto.getBadge());
        exitTrainer = trainerRepository.save(exitTrainer);
        return exitTrainer;
    }

    public TrainerDto deleteTrainer(Long id) {
        Trainer trainer = trainerRepository.findById(id).orElseThrow();
        trainerRepository.delete(trainer);
        return null;
    }
}
