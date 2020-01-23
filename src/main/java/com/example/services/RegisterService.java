package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.RegisterDao;
import com.example.pojo.User;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao dao;
	
	public void saveUser(User user) {
		System.out.println("saveUser :: RegisterService");
		dao.save(user);
	}
}
