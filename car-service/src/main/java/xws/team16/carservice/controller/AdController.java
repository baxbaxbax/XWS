package xws.team16.carservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xws.team16.carservice.dto.AdDTO;
import xws.team16.carservice.dto.AdListDTO;
import xws.team16.carservice.service.AdService;

import java.sql.SQLException;

@CrossOrigin(origins = "*")
@Slf4j
@RestController
@RequestMapping(value = "/ad")
public class AdController {

    private AdService adService;

    @Autowired
    public AdController(AdService adService) {
        this.adService = adService;
    }

    /**
     * Creates new Ad and Car
     * @param adDTO is ad to be created with all fields
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addNew(@RequestBody AdDTO adDTO) throws SQLException {
        log.info("Ad controller - new ad");
        return this.adService.newAd(adDTO);
    }

    /**
     * Get ad with specific id
     * @param id is id of the ad
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getAd(@PathVariable Long id) throws SQLException {
        log.info("Ad controller - new ad");
        return this.adService.getOneAdById(id);
    }

    /**
     * Creates new Ad for existing car
     * @param carId is id of a car which ad is for
     */
    // @PostMapping(value = "/{carId}")
    // public ResposnseEntity<?> addNew(@PathVariable Long carId) {}

    /**
     * Remove ads for specific user
     * @param user_id is id of the user
     */
    @GetMapping(value = "/removeAll/{user_id}")
    public ResponseEntity<?> removeAds(@PathVariable Long user_id) {
        log.info("Ad controller - remove all ad for user");
        return this.adService.removeAds(user_id);
    }

    @GetMapping( value = "/city")
    public ResponseEntity<?> searchCity() {
        log.info("Ad controller - searching cities");
        return this.adService.findCities();
    }

    @PostMapping(value = "/users-cars")
    public ResponseEntity<?> getUsersForCars(@RequestBody AdListDTO adListDTO) {
        log.info("Requesting users for ads");
        return this.adService.getUsersForCars(adListDTO);
    }
}
