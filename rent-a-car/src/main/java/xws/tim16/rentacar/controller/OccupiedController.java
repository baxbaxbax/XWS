package xws.tim16.rentacar.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xws.tim16.rentacar.dto.OccupiedDTO;
import xws.tim16.rentacar.service.OccupiedService;


@CrossOrigin(origins = "*")
@RestController @Slf4j
@RequestMapping(value = "/occupied")
public class OccupiedController {
    private OccupiedService occupiedService;

    @Autowired
    public OccupiedController(OccupiedService occupiedService) {
        this.occupiedService = occupiedService;
    }

    /**
     * Creates Occupied for specific car
     */
    @PostMapping
    public ResponseEntity<?> addNew(@RequestBody OccupiedDTO occupiedDTO) {
        log.info("Occupied controller - new occupied");
        return this.occupiedService.newOccupied(occupiedDTO);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getNew(@PathVariable Long id ) {
        log.info("Occupied controller - get occupied");
        return this.occupiedService.getOccupied(id);
    }

    @GetMapping(value = "/user/{username}")
    public ResponseEntity<?> getOccupationUser(@PathVariable String username ) {
        log.info("Occupied controller - get occupations");
        return this.occupiedService.getOccupiedByUser(username);
    }

}
