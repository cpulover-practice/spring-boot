package com.cpulover.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages=("com.cpulover.springboot"))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
