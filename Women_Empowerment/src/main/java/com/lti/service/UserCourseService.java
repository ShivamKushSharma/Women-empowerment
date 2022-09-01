package com.lti.service;

import com.lti.entity.User_course;

public interface UserCourseService {

	public User_course createUserCourse(User_course ucourse);
	public User_course fetch(int u_id);
	public User_course deleteUserCourse(int c_id);
}
