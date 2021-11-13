package com.cg.spring.boot.lab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	//http://localhost:8083/hey
	@RequestMapping("/hey")
	public String hey() {
		System.out.println("hey");
		return "Hey Spring!";
	}
	

}
