package xws.team16.requestservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xws.team16.requestservice.dto.OccupiedDTO;
import xws.team16.requestservice.dto.PatchRequestDTO;
import xws.team16.requestservice.dto.ShoppingCartDTO;
import xws.team16.requestservice.service.RentRequestService;

@CrossOrigin
@RestController @Slf4j
public class RequestController {

    @Autowired
    private RentRequestService rentRequestService;

    /**
     * Returns all requests of a user
     * @return List of requests
     */
    @GetMapping
    public ResponseEntity<?> getAll() {
        log.info("Request controller - get all requests for user ");
        return this.rentRequestService.getAll();
    }

    /**
     * Returns all request that user have received
     * @return list of requests
     */
    @GetMapping(value = "/received")
    public ResponseEntity<?> getReceivedRequests() {
        log.info("Get all received requests");
        return this.rentRequestService.getAllReceived();
    }

    /**
     * Create renting requests for a user
     * @param shoppingCart requests and bundles dto
     * @return 201 if created successfully
     */
    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> newRequests(@RequestBody ShoppingCartDTO shoppingCart) {
        log.info("Request controller - new requests");
        return this.rentRequestService.newRequests(shoppingCart);
    }

    /**
     * Cancels a request given its id
     * @param request request to be changed
     * @return 200 ok if cancelled successfully
     */
    @PatchMapping(value = "/cancel", consumes = "application/json")
    public ResponseEntity<?> cancelRequest(@RequestBody PatchRequestDTO request) {
        log.info("Request controller - cancel request with id " + request.getId());
        return this.rentRequestService.cancelRequest(request.getId());
    }

    /**
     * Accepts a request given its id and cancels all other requests in that period for rented car
     * @param request request to be changed
     * @throws xws.team16.requestservice.exceptions.InvalidOperationException if request is not in status pending
     * @return 200 ok if all done successfully
     */
    @PatchMapping(value = "/accept", consumes = "application/json")
    public ResponseEntity<?> acceptRequest(@RequestBody PatchRequestDTO request) {
        log.info("Request controller - accept request with id " + request.getId());
        return this.rentRequestService.acceptRequest(request.getId());
    }

    /**
     * Refuses a request given its id
     * @param request request to be changed
     * @return 200 ok if request is refused
     */
    @PatchMapping(value = "/refuse", consumes = "application/json")
    public ResponseEntity<?> refuseRequest(@RequestBody PatchRequestDTO request) {
        log.info("Request controller - refuse request with id " + request.getId());
        return this.rentRequestService.refuseRequest(request.getId());
    }

    @PostMapping(value = "/occupied" , consumes = "application/json")
    public ResponseEntity<?> occupiedRequests(@RequestBody OccupiedDTO occupiedDTO) {
        log.info("Request controller - occupied requests");
        return this.rentRequestService.cancelOccupiedRequests(occupiedDTO);
    }

}
