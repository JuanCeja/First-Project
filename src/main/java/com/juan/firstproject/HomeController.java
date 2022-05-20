package com.juan.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "Hello World! This is a tester!";
	}

	@RequestMapping("/new_route")
	public String newRoute() {
		return "This is my new route! Hey check me out im making progress!";
	}
	
	@RequestMapping("/world")
	public String world() {
		return "Class level annotations are cool!";
	}
}
