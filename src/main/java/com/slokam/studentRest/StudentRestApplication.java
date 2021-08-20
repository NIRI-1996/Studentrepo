package com.slokam.studentRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.slokam.studentRest.Controller"})
public class StudentRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestApplication.class, args);
	}

}
