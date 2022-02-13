package com.example.SpringBoot_Training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootTrainingApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World";
	}

	@RequestMapping("/test")
	String test() {
		return "test ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTrainingApplication.class, args);
	}

}
