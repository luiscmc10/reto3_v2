package com.usa.reto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = { "com.usa.reto3.Model"})
@SpringBootApplication
public class Ciclo32Application {

	public static void main(String[] args) {
		SpringApplication.run(Ciclo32Application.class, args);
	}

}
