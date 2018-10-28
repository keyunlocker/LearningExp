package com.springdocker.lesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdockerApplication.class, args);
	}
	
	@GetMapping("/try")
	public String name() {
		return "Mrinass";
	}
}
