package com.example.controllers;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pojo.User;
import com.example.services.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService service;
	
	@RequestMapping(value="/register")
	public String saveUser(User user) {
		service.saveUser(user);
		return "login";
	}
}
