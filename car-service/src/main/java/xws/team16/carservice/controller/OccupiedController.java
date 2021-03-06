package xws.team16.carservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xws.team16.carservice.dto.OccupiedDTO;
import xws.team16.carservice.service.OccupiedService;

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
    public ResponseEntity<?> getOccupied(@PathVariable Long id ) {
        log.info("Occupied controller - get occupied");
        return this.occupiedService.getOccupied(id);
    }

    @GetMapping(value = "/user/{username}")
    public ResponseEntity<?> getOccupationUser(@PathVariable String username ) {
        log.info("Occupied controller - get occupations");
        return this.occupiedService.getOccupiedByUser(username);
    }

    @PostMapping(value = "/rent")
    public ResponseEntity<?> addNewRequestOccupation(@RequestBody OccupiedDTO occupiedDTO) {
        log.info("Adding new occupation for accepted request");
        return this.occupiedService.newOccupiedRequest(occupiedDTO);
    }

}
