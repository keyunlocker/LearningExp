package com.dockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerappApplication.class, args);
	}
	
	@GetMapping("/try")
	public String name() {
		return "Mrinass";
	}
}
