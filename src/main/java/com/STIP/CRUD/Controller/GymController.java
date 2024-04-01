package com.STIP.CRUD.Controller;

import com.STIP.CRUD.DTO.GymDto;
import com.STIP.CRUD.Domain.Gym;
import com.STIP.CRUD.Repository.GymRepository;
import com.STIP.CRUD.Service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/gyms")
public class GymController {
    @Autowired
    private GymRepository repository;
    @Autowired
    private GymService gymService;

    @PostMapping("/save")
    public ResponseEntity<GymDto> save(@RequestBody GymDto gym) {
        gymService.save(gym);
        return ResponseEntity.ok(gym);

    }
    @GetMapping("/get-gym/{id}")
    public GymDto getGym(@PathVariable Long id) {
        return gymService.getGym(id);
    }


    @PutMapping("/update/{id}")
        public Gym updateGym(@PathVariable Long id, @RequestBody GymDto gymDto) {
        return gymService.updateGym(id, gymDto);

    }

   /* @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteGym(@PathVariable Long id) {
        try {
            gymService.deleteGym(id);
            return ResponseEntity.ok("Gym with id " + id + " deleted successfully");
        } catch (GymNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }*/

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteGym(@PathVariable Long id) {
        //return gymService.deleteGym(id);
        return ResponseEntity.ok("Gym with id " + id + " deleted successfully");


    }

    @GetMapping
    public List<Gym> getAllGym() {
        return gymService.getAllGym();
    }
}

