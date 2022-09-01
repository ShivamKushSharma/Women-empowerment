package com.lti.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.UCourseRepository;
import com.lti.entity.User;
import com.lti.entity.User_course;

@Service("ucservice")
public class UserCourseServiceImpl implements UserCourseService{

	@Autowired
	private UCourseRepository ucrepo;
	
	@Override
	@Transactional
	public User_course createUserCourse(User_course ucourse) {
		ucrepo.save(ucourse);
		return ucourse;
	}

	@Override
	public User_course fetch(int u_id) {
		Optional<User_course> userfind = ucrepo.findById(u_id);
		User_course user = null;
		if (userfind.isPresent()) {
			user = userfind.get();
		}

		return user;
	}

	@Override
	public User_course deleteUserCourse(int c_id) {
		Optional<User_course> delemp= ucrepo.findById(c_id);
		User_course usercourse= null;
		if(delemp.isPresent()) {
			usercourse= delemp.get();
			ucrepo.delete(usercourse);
		}
		return usercourse;
	}

}
