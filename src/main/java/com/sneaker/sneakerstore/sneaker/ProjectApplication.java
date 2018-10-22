package com.sneaker.sneakerstore.sneaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories("edu.depaul.cdm.se.sampleproject.book.spring.jpa")
//@EnableScan("edu.depaul.cdm.se.sampleproject.book.jpa")
public class ProjectApplication {

	public static void main(String[] args) {
		System.out.println("__Example___");
		SpringApplication.run(ProjectApplication.class, args);
	}
}
