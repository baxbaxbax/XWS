package xws.tim16.rentacar.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xws.tim16.rentacar.dto.CommentDTO;
import xws.tim16.rentacar.service.CommentService;


@RestController @Slf4j
@CrossOrigin(origins = "*")
@RequestMapping(value = "/comment")
public class CommentController {
    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping()
    private ResponseEntity<?> createComment(@RequestBody CommentDTO commentDTO) {
        log.info("Comment controller - create comment");
        return this.commentService.createComment(commentDTO, false);
    }

    @PostMapping(value = "/reply")
    private ResponseEntity<?> createCommentReply(@RequestBody CommentDTO commentDTO) {
        log.info("Comment controller - create comment");
        return this.commentService.createComment(commentDTO, true);
    }

    @GetMapping(value = "/car/{carId}")
    private ResponseEntity<?> getComments(@PathVariable Long carId){
        log.info("Comment controller - getting comment for car");
        return this.commentService.getComments(carId);
    }

    @GetMapping(value = "/check/{username}/{id}")
    private ResponseEntity<?> checkComment(@PathVariable Long id, @PathVariable String username){
        log.info("Comment controller - check comment created");
        return this.commentService.check(username, id);
    }

    @GetMapping()
    private ResponseEntity<?> getAllComments(){
        log.info("Comment controller - getting all comments");
        return this.commentService.getAllComments();
    }

    @GetMapping(value = "/accept/{id}/{decision}")
    private ResponseEntity<?> acceptOrRefuse(@PathVariable Long id, @PathVariable Boolean decision){
        log.info("Comment controller - accepting or refusing comment");
        return this.commentService.acceptOrRefuse(id, decision);
    }
}
