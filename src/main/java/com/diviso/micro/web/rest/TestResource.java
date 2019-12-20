package com.diviso.micro.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestResource {

	
	
	@GetMapping("/message")
	public String test(@RequestParam String message) {
		return "The message is "+message;
	}
	
	@PostMapping("/message-post")
	public String testPost() {
		return "The message is Post";
	}
}
