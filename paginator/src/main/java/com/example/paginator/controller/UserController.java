package com.example.paginator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paginator.model.User;
import com.example.paginator.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="/users")
	public Page<User> getUsers(Pageable pageable){
		return this.userService.listAllByPage(pageable);	
	}

}
