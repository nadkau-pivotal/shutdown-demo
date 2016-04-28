package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShutdownController {

	public ShutdownController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String sayHello(){
		return "Hello";
	}
}
