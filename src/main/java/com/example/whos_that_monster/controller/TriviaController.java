package com.example.whos_that_monster.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/trivia")
public class TriviaController {

    @GetMapping
    public ResponseEntity<String> getRandomTrivia() {
        return ResponseEntity.ok("Random trivia");
    }
}
