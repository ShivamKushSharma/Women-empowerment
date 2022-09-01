package com.lti.service;

import java.util.List;

import com.lti.entity.User;

public interface UserService {
	public User createUser(User user);
	public User fetch(int id);

	public User verifyUser(User login);
	

	//public List<User> fetchEach();
	
	

}
