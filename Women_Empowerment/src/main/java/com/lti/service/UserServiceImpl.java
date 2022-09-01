package com.lti.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.UserRepository;
import com.lti.entity.User;

@Service("userservice")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository urepo;

	@Transactional
	public User createUser(User user) {

		urepo.save(user);
		return user;

	}

	public User fetch(int u_id) {
		Optional<User> userfind = urepo.findById(u_id);
		User user = null;
		if (userfind.isPresent()) {
			user = userfind.get();
		}

		return user;
	}

	@Override
	public User verifyUser(User login) {
		String username = login.getUsername();
		String password = login.getPassword();
		
		//boolean flag = false;
		List<User> list = urepo.findAll();
		for (User x : list) {
			System.out.println(x.getUsername());
			if (username.equals(x.getUsername()) && password.equals(x.getPassword()))
				return x;
		}
		return null;
	}


	

}
