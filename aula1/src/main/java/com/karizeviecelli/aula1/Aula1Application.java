package com.karizeviecelli.aula1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.karizeviecelli.aula1.services.SalaryService;

@SpringBootApplication
public class Aula1Application implements CommandLineRunner{
	@Autowired
	private SalaryService salaryService;

	
	

	public static void main(String[] args) {
		SpringApplication.run(Aula1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
