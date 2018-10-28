package com.springLearning.lesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearningApplication.class, args);
	}
	
	@GetMapping("/")
	public String name() {
		return "Mrinass";
	}
}
