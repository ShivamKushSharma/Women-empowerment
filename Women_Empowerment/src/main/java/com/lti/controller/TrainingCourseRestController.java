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
import com.lti.entity.Training_course;
import com.lti.entity.User_course;
import com.lti.service.TrainingCourseService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TrainingCourseRestController {

	@Autowired
	private TrainingCourseService tcservice;
	
	//@RequestMapping(path = "/trainingcourse/add", method = RequestMethod.POST)
	@PostMapping("/trainingcourse/add")
	public Training_course add(@RequestBody Training_course training_course) {
		return tcservice.createcourse(training_course);
		//return "{\"status\" : \"Ngo Record  Added Successfully!\"}";
	}
	
	//@RequestMapping(path = "/trainingcourse/{t_id}", method = RequestMethod.GET)
	@GetMapping( "/trainingcourse/{t_id}")
	public Training_course findTc(@PathVariable("t_id") int t_id) {
		
		return tcservice.findTc(t_id);
	}
	
	@PutMapping("/trainingcourse/{t_id}")
	public Training_course updatecourse(@PathVariable("t_id") int t_id,@RequestBody Training_course modifiedtc) {
		
		Training_course uptc= tcservice.updatecourse(t_id, modifiedtc);
		return uptc;
	}
	
	@GetMapping("/trainingcourse/all")
	public List<Training_course> fetchAll(){
		return tcservice.fetchAll();
	}
	
	@DeleteMapping("/trainingcourse/{t_id}")
	public Training_course deletecourse(@PathVariable("t_id") int t_id)	{
		Training_course old_trainingcourse= tcservice.deletecourse(t_id);
		return old_trainingcourse;
	}
	
}
