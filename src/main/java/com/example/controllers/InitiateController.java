package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitiateController {

	@RequestMapping(value="/")
	public String welcomePage() {
		System.out.println("testing!!");
		return "Home";
	}
}
