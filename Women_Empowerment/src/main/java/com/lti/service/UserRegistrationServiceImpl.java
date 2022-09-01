package com.lti.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.RegisRepository;
import com.lti.dao.TcRepository;
import com.lti.dao.UserRepository;
import com.lti.entity.Registration;
import com.lti.entity.Training_course;
import com.lti.entity.User;
import com.lti.entity.User_course;

@Service("registration_service")
public class UserRegistrationServiceImpl implements UserRegistrationService{

	@Autowired
	private RegisRepository rrepo;
	@Autowired 
	private UserRepository ur;
	
	@Autowired
	private TcRepository tc;
	
	@Override
	
	
	@Transactional
	public Registration createRegistration(Registration register) {
		//register.getU_id().getU_id();
//		User u = ur.getReferenceById(register.getU_id().getU_id());
//		Training_course t = tc.getReferenceById(register.getTraining_course().getT_id());
//		register.setTraining_course(t);
//		register.setU_id(u);
		rrepo.save(register);
		return register;
		
	}

	@Override
	public Registration updateRegistration(int r_id, Registration register) {
		
		return rrepo.save(register);
	}


	public List<Registration> registrationlist() {
		List<Registration> rlist=rrepo.findAll();
		return rlist;
	}

	@Override
	public Registration deleteRegistration(int r_id) {
		Optional<Registration> delreg= rrepo.findById(r_id);
		Registration userreg= null;
		if(delreg.isPresent()) {
			userreg= delreg.get();
			rrepo.delete(userreg);
		}
		return userreg;
	
	}

}
