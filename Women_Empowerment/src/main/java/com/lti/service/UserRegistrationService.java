package com.lti.service;

import java.util.List;

import com.lti.entity.Registration;

public interface UserRegistrationService {

	public Registration createRegistration(Registration register);
	public Registration updateRegistration(int r_id, Registration register);
	public List<Registration> registrationlist();
	public Registration deleteRegistration(int r_id);
	
}
