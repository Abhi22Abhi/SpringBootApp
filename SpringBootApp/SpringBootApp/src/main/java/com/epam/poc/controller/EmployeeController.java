package com.epam.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@GetMapping("/greating")
	public String greatingsRestEndPoint() {
		return "Bcz of DB Installation Permission Issues, I'm doing this simple REP";
	}
}

// URI for testing REP is 