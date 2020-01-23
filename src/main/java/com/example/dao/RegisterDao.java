package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.User;

@Repository
public interface RegisterDao extends CrudRepository<User, String> {
	
}
