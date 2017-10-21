package com.nbg.fintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class HackFinApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackFinApplication.class, args);
	}
}
