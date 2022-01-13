package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("diego/")
public class DiegoController {

    @GetMapping
    public Mono<String> status(){
        return Mono.just("OK");
    }
}
