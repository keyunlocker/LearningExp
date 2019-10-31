package com.envspringapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties
@Data
public class ReadProperties {
	
	String name;
	String school;

}
