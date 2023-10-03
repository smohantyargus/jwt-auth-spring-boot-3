package com.sarbajit.jwtauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtauthApplication.class, args);
		System.out.println("API RUNNING ON PORT: 8080");
	}

}
