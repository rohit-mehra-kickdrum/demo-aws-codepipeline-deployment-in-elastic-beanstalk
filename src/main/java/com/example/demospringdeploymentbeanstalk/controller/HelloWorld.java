package com.example.demospringdeploymentbeanstalk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("api/v1/greeting")
    public ResponseEntity<String> getGreeting(){
        return ResponseEntity.ok("Hello there! The output is from Beanstalk");
    }
}
