package com.example.demoazurespringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoazurespringbootprojectApplication {
	
	@GetMapping("/message")
	public String meesage()
	{
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoazurespringbootprojectApplication.class, args);
	}

}
