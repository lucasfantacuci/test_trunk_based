package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController("/health")
public class HealthController {
    
    @GetMapping
    public Mono<String> getHealth(){
        return Mono.just("{ status': 'UP'}");
    }
}
