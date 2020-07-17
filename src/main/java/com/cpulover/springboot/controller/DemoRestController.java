package com.cpulover.springboot.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoRestController {
	@GetMapping()
	public String sayHello() {
		return "Hello world!!!!!!! Time on server is: " + LocalDateTime.now();
	}
	
	@GetMapping("/hello/{name}")
	public String sayHelloName(@PathVariable String name) {
		return "Hello, " + name;
	}
	
	@GetMapping("/hello")
	public String sayHello2(@RequestParam("name") String name) {
		return "Hello, " + name;
	}
}
