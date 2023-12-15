package com.nagarro.springBoot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.nagarro.springBoot.service.UserService;
import com.nagarro.springBoot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{username}/{password}")
	public  User getUserDetails(@PathVariable("username")String username , @PathVariable("password")String password){
		
		User user = this.userService.getUserByUsernameAndPassword(username, password);
		return user;
		
		
		
	}

}
