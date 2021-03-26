package com.example.java.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
		
	}
	
	@GetMapping ("/user")
	public String user() {
		return ("<h1>Welcome User </h1>");
	}
	
	@GetMapping ("/adnmin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}
}
