package com.scully.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @GetMapping
    public ResponseEntity getGreeting(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

}
