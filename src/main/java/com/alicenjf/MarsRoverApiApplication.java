package com.alicenjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;



@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class MarsRoverApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsRoverApiApplication.class, args);
	}

}
