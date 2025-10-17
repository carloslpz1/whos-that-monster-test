package com.example.whos_that_monster.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/trivia")
public class TriviaController {

    @GetMapping
    public ResponseEntity<String> getRandomTrivia() {
        return ResponseEntity.ok("Random trivia");
    }

    @PostMapping("/{id}/validate")
    public ResponseEntity<String>  validateAnswer(@PathVariable("id") String id) {
        return ResponseEntity.ok(id);
    }
}
