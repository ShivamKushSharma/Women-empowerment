package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.User;
import com.lti.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController

public class UserRestController {
	@Autowired
	private UserService uservice;
	/*
	 * @GetMapping("/user/{u_id}") public User getUserById(@PathVariable("u_id") int
	 * u_id) {
	 * 
	 * User user = uservice.fetch(u_id); return user; }
	 * 
	 * //http:localhost:8081/students/student-body-object-json //post the new
	 * student data from client to server
	 * 
	 * @PostMapping("/users") public User addUser(@RequestBody User user) { User
	 * user1 = uservice.createUser(user); return user1; }
	 */
	
	//@RequestMapping(path = "/user/add", method = RequestMethod.POST)
	@PostMapping( "/user/add")
	public User add(@RequestBody User user) {
		return uservice.createUser(user);
		//return "{\"status\" : \"User Record  Added Successfully!\"}";
	}

	//@RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
	@GetMapping("/user/{id}")
	public User fetch(@PathVariable("id") int u_id) {
		return uservice.fetch(u_id);
	}
	
	//@RequestMapping(path = "/userlogin/verifyuser", method = RequestMethod.POST)
//	@GetMapping("/userlogin/verifyuser")
//	public String verifyUser(@RequestBody User login) {
//		User user = uservice.verifyUser(login);
//	if (user != null) {
//			return "{\"status\" : \"" + user.getName() + " you are logged in  Successfully!\"}";
//	} else {
//		return "{\"status\" : \"Sorry Your Details are incorrect!\"}";
//	}
//	}
	@PostMapping("/userlogin/verifyUser")
	public ResponseEntity<String> verifyUser(@RequestBody User login) {
		User user = uservice.verifyUser(login);
		if (user != null) {
			return new ResponseEntity<String>("{\"status\" : \"" + user.getName() + " you are logged in  Successfully!\"}", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("{\"status\" : \"Sorry Your Details are incorrect!\"}", HttpStatus.NO_CONTENT);
		}
	}
	
//	
//	@GetMapping("/userlogin")
//	public ResponseEntity<?>LoginUser(@RequestBody User userdata){
//		User user = uservice.findByUsername(userdata.getUsername());
//		if
//		
//	}
//	

}
