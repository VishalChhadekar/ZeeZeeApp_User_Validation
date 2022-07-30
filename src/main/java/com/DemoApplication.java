package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //resemblance to @Configuration and EnableWebMVC
@ComponentScan("com")
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Program Initiated");
		SpringApplication.run(DemoApplication.class, args);
	}

}
