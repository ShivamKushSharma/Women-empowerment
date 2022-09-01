package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.User;
import com.lti.entity.User_course;
import com.lti.service.UserCourseService;


@RestController
public class UserCourseRestController {

	@Autowired
	private UserCourseService ucservice;
	
	@RequestMapping(path = "/usercourse/add", method = RequestMethod.POST)
	public String add(@RequestBody User_course user) {
		ucservice.createUserCourse(user);
		return "{\"status\" : \"User Record  Added Successfully!\"}";
	}

	@RequestMapping(path = "/usercourse/{id}", method = RequestMethod.GET)
	public User_course fetch(@PathVariable("id") int u_id) {
		return ucservice.fetch(u_id);
	}
	
	@DeleteMapping("/usercourse/{id}")
	public User_course deleteUserCourse(@PathVariable("id") int c_id)	{
		User_course old_usercourse= ucservice.deleteUserCourse(c_id);
		return old_usercourse;
	}
}
