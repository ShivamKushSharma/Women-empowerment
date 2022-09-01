package com.lti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.NgoRepository;
import com.lti.dao.UserRepository;
import com.lti.entity.Ngo;
import com.lti.entity.Registration;
import com.lti.entity.User;

@Service("ngoservice")
public class NgoServiceImpl implements NgoService{

	@Autowired
	private NgoRepository ngorepo;
	
	
	@Override
	@Transactional
	public Ngo createNgo(Ngo ngo) {
		ngorepo.save(ngo);
		return ngo;
	}

	@Override
	public Ngo fetch(int ngo_id) {
		Optional<Ngo> ngofind = ngorepo.findById(ngo_id);
		Ngo ngo = null;
		if (ngofind.isPresent()) {
			ngo = ngofind.get();
		}

		return ngo;
	}
	
	
	

	@Override
	public Ngo updateNgo(int ngo_id, Ngo ngo) {
		
		return ngorepo.save(ngo);
	}

	@Override
	public List<Ngo> ngo_list() {
		List<Ngo> ngo_list=ngorepo.findAll();
		return ngo_list;
	}

	@Override
	public Ngo deletengo(int ngo_id) {
		Optional<Ngo> delreg= ngorepo.findById(ngo_id);
		Ngo userreg= null;
		if(delreg.isPresent()) {
			userreg= delreg.get();
			ngorepo.delete(userreg);
		}
		return userreg;
	}

	
}
