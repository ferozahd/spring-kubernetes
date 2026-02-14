package com.tutorial.kubernet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetApplication.class, args);
	}

    @GetMapping
    ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello world!");
    }

}
