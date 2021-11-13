package com.cg.spring.boot.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComCgSpringBootLabApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(ComCgSpringBootLabApplication.class, args);
		System.out.println("End");
	}

}
