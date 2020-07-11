package com.cpulover.springboot.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class DemoRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello world! Time on server is: " + LocalDateTime.now();
	}

}
