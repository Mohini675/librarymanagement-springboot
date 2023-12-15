package com.nagarro.springBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.nagarro.springBoot.dao.UserRepository;
import com.nagarro.springBoot.model.User;

@Component
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public User getUserByUsernameAndPassword(String username , String password) {
		User user = this.userRepository.findByUsernameAndPassword(username, password);
		return user;
	}

	
}
