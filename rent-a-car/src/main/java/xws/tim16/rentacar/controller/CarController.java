package xws.tim16.rentacar.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import xws.tim16.rentacar.dto.CarInfoDTO;
import xws.tim16.rentacar.service.CarService;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping(value = "/car")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/statistics/{ownersID}")
    public ResponseEntity<?> getStatistics(@PathVariable Long ownersID){
        log.info("Car Controller - get statistics of owner with id " + ownersID);
        return carService.getStatistics_ResponseEntity(ownersID);
    }

    /**
     * Get car for logged user
     */
    @PreAuthorize("hasAuthority('ROLE_USER') or hasAuthority('ROLE_AGENT')")
    @GetMapping(value = "/user/{username}")
    public ResponseEntity<?> getCarsByUser(@PathVariable String username){
        log.info("Car controller - getting " + username + "\'s cars");
        return this.carService.getCarsByUser(username);
    }

    @GetMapping(value = "/{car_id}")
    public ResponseEntity<?> getCarById(@PathVariable Long car_id){
        log.info("Car controller - get car by its id (id = " + car_id + ")");
        return carService.getCarById_ResponseEntity(car_id);
    }

    @PatchMapping(value = "")
    public ResponseEntity<?> editCar(@RequestBody CarInfoDTO carInfoDTO){
        log.info("Car controller - get car by its id (id = " + carInfoDTO.getId() + ")");
        return carService.editCar(carInfoDTO);
    }

}
