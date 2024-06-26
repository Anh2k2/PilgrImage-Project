package com.mytrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytrip.repository.UserRepository;
import com.mytrip.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User SaveUser(User user) {
		User save = userRepository.save(user);
		return save;
	}

	public User finduserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public long UserCount() {
		return userRepository.count();
	}

}
