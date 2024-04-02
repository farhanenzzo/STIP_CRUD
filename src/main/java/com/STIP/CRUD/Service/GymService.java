package com.STIP.CRUD.Service;

import com.STIP.CRUD.DTO.GymDto;
import com.STIP.CRUD.Domain.Gym;
import com.STIP.CRUD.Repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymService {
    @Autowired
    private GymRepository gymRepository;

    public void save(GymDto gym) {
        Gym gm = new Gym();
        gm.setName(gym.getName());
        gymRepository.save(gm);


    }
    public GymDto getGym(Long id) {
        Gym gym = gymRepository.findById(id).orElseThrow();
        GymDto gymDto = new GymDto();
        gymDto.setName(gym.getName());
        return gymDto;

    }

    public Gym updateGym(Long id, GymDto gymDto ) {
        Gym exitgym = gymRepository.findById(id).orElseThrow();
        exitgym.setName(gymDto.getName());
        exitgym = gymRepository.save(exitgym);
        return exitgym;


}

/*
    public Gym deleteGym(Long id) {
        Optional<Gym> gymOptional = gymRepository.findById(id);
        if (gymOptional.isPresent()) {
            Gym gym = gymOptional.get();
            gymRepository.delete(gym);
            return(gym);
        } else {
            throw new GymNotFoundException("Gym not found with id: " + id);
        }
    }
*/



    public GymDto deleteGym(Long id) {
        Gym gym = gymRepository.findById(id).orElseThrow();
        gymRepository.delete(gym);
        return null;
    }


    public List<Gym> getAllGym() {
        return gymRepository.findAll();
    }
}
