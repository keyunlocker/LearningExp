package com.envspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEnvApp {
	
	@Autowired
	ReadProperties readProperties;
	
	
	@GetMapping("/check")
	public String check() {
		return readProperties.getName() + "-----------" +readProperties.getSchool();
	}
}
