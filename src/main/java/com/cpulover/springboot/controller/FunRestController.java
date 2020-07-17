package com.cpulover.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fun")
public class FunRestController {

	// inject value from application.properties
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/coach")
	public String showCoach() {
		return coachName;
	}
	
	@GetMapping("/team")
	public String showteam() {
		return teamName;
	}
}
