package com.sarbajit.jwtauth;

import com.sarbajit.jwtauth.auth.AuthenticationService;
import com.sarbajit.jwtauth.auth.RegisterRequest;
import com.sarbajit.jwtauth.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JwtauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtauthApplication.class, args);
		System.out.println("API RUNNING ON PORT: 8080");
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(AuthenticationService authenticationService){
//		return args -> {
//			var admin = RegisterRequest.builder()
//					.firstname("Admin")
//					.lastname("Admin")
//					.email("admin@admin.com")
//					.password("password")
//					.role(Role.ADMIN)
//					.build();
//			System.out.println("ADMIN TOKEN: "+ authenticationService.register(admin).getAccessToken());
//
//			var manager = RegisterRequest.builder()
//					.firstname("Manager")
//					.lastname("Manager")
//					.email("manager@manager.com")
//					.password("password")
//					.role(Role.MANAGER)
//					.build();
//			System.out.println("MANAGER TOKEN: "+ authenticationService.register(manager).getAccessToken());
//		};
//	}
}
