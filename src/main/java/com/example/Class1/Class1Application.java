package com.example.Class1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Class1Application {

	public static void main(String[] args) {
		SpringApplication.run(Class1Application.class, args);
	}
	
	public static String method1() {
		return "abc";
	}

}
