package com.STIP.CRUD.Controller;

import com.STIP.CRUD.DTO.GymDto;
import com.STIP.CRUD.DTO.TrainerDto;
import com.STIP.CRUD.Domain.Gym;
import com.STIP.CRUD.Domain.Trainer;
import com.STIP.CRUD.Repository.TrainerRepository;
import com.STIP.CRUD.Service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
public class TrainerController {
    @Autowired
    private TrainerService trainerService;
    @Autowired
    private TrainerRepository repository;



    @PostMapping("/save")
    public ResponseEntity<TrainerDto> save(@RequestBody TrainerDto trainer) {
        trainerService.save(trainer);
        return ResponseEntity.ok(trainer);
    }

    @GetMapping("/get-trainer/{id}")
    public TrainerDto getTrainer(@PathVariable Long id) {
        return trainerService.getTrainer(id);
    }

    @PutMapping("/update/{id}")
    public Trainer updateTrainer(@PathVariable Long id, @RequestBody TrainerDto trainerDto) {
        return trainerService.updateTrainer(id, trainerDto);
    }

    @DeleteMapping("/delete/{id}")
    public TrainerDto deleteTrainer(@PathVariable Long id){
        return trainerService.deleteTrainer(id);
    }
}
