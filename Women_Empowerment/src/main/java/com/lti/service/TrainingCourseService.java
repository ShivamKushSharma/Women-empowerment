package com.lti.service;

import java.util.List;

import com.lti.entity.Training_course;

public interface TrainingCourseService {

	public Training_course createcourse(Training_course training_course);
	public Training_course findTc(int t_id);
	public List<Training_course> fetchAll();
	public Training_course updatecourse(int t_id, Training_course training_course);
	public Training_course deletecourse(int t_id);
}
