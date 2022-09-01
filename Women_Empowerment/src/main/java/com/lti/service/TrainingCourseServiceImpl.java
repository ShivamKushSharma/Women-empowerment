package com.lti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.TcRepository;
import com.lti.entity.Ngo;
import com.lti.entity.Training_course;
import com.lti.entity.User_course;

@Service("tcservice")
public class TrainingCourseServiceImpl implements TrainingCourseService{

	@Autowired
	private TcRepository tcrepo;
	
	
	@Override
	@Transactional
	public Training_course createcourse(Training_course training_course) {
		tcrepo.save(training_course);
		return training_course;
	}

	@Override
	public Training_course findTc(int t_id) {
		Optional<Training_course> trainingfind = tcrepo.findById(t_id);
		Training_course course = null;
		if (trainingfind.isPresent()) {
			course = trainingfind.get();
		}

		return course;
	}

	@Override
	public List<Training_course> fetchAll() {
		List<Training_course> tc_list=tcrepo.findAll();
		return tc_list;
		
	}

	@Override
	public Training_course updatecourse(int t_id, Training_course training_course) {
		
		return tcrepo.save(training_course);
	}

	@Override
	public Training_course deletecourse(int t_id) {
		Optional<Training_course> delcourse= tcrepo.findById(t_id);
		Training_course course= null;
		if(delcourse.isPresent()) {
			course= delcourse.get();
			tcrepo.delete(course);
		}
		return course;
	}

}
