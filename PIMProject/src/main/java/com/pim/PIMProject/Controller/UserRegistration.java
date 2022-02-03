package com.pim.PIMProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistration {
	@GetMapping("/")
	public String test(){
		return "XYZ";
	}
}
