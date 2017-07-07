package com.example.paginator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.paginator.model.User;
import com.example.paginator.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Page<User> listAllByPage(Pageable pageable){
		return this.userRepository.findAll(pageable);
	}

}
