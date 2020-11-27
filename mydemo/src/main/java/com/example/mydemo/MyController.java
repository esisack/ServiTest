package com.example.mydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String hola() {
		return "Hola mundo muchachos";	
		
	}

}
