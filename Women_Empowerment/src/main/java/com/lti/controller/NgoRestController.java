package com.lti.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
import com.lti.entity.User;
import com.lti.service.NgoService;

@CrossOrigin(origins="http://localhost:4200")
@RestController

public class NgoRestController {

	@Autowired
	private NgoService ngoservice;
	
	//@RequestMapping(path = "/ngo/add", method = RequestMethod.POST)
	@Transactional
	@PostMapping("/ngo/add")
	public Ngo add(@RequestBody Ngo ngo) {
		return ngoservice.createNgo(ngo);
		//return "{\"status\" : \"Ngo Record  Added Successfully!\"}";
	}
	
	//@RequestMapping(path = "/ngo/{ngo_id}", method = RequestMethod.GET)
	@GetMapping("/ngo/{ngo_id}")
	public Ngo fetch(@PathVariable("ngo_id") int ngo_id) {
		
		return ngoservice.fetch(ngo_id);
	}
	
	@PutMapping("/ngo/{ngo_id}")
	public Ngo updateNgo(@PathVariable("ngo_id") int ngo_id,@RequestBody Ngo modifiedngo) {
		
		Ngo upngo= ngoservice.updateNgo(ngo_id, modifiedngo);
		return upngo;
	}
	
	@GetMapping("/ngo/all")
	public List<Ngo> ngo_list(){
		return ngoservice.ngo_list();
	}
	@DeleteMapping("/{id}")
	public Ngo deletengo(@PathVariable("id") int ngo_id)	{
		Ngo old_usercourse= ngoservice.deletengo(ngo_id);
		return old_usercourse;
	}
	
}
