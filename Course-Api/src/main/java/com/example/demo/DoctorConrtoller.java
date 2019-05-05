package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorConrtoller {

	
	@RequestMapping("/demo")
	public String getInfo()
	{
		return "Hello";
	}
}
