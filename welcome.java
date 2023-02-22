package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class welcome {
	@GetMapping("/Display")
	public String    show() {
		return "welcome";
	}
	
	@GetMapping("/home")
	public String    how() {
		return "welcome";
	}
}
