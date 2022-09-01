package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Ngo;
import com.lti.entity.Registration;
import com.lti.entity.User_course;
import com.lti.service.UserRegistrationService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RegistrationRestController {

	@Autowired
	private UserRegistrationService urservice;
	
	//@RequestMapping(path = "/user/addregistration", method = RequestMethod.POST)
	@PostMapping("/user/addregistration")
	public Registration add(@RequestBody Registration register) {
		return urservice.createRegistration(register);
//		return "{\"status\" : \"Registered Successfully!\"}";
	}
	
	@PutMapping("/user/{r_id}")
	public Registration updateRegistration(@PathVariable("r_id") int r_id,@RequestBody Registration modifiedreg) {
		
		Registration upreg= urservice.updateRegistration(r_id, modifiedreg);
		return upreg;
	}
	
	@GetMapping("/user/register/all")
	public List<Registration> rlist(){
		return urservice.registrationlist();
	}
	
	@DeleteMapping("/deleteregister/{id}")
	public Registration deleteRegistration(@PathVariable("id") int r_id)	{
		Registration old_usercourse= urservice.deleteRegistration(r_id);
		return old_usercourse;
	}
}
