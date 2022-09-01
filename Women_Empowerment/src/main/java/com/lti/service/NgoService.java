package com.lti.service;

import java.util.List;

import com.lti.entity.Ngo;


public interface NgoService {

	public Ngo createNgo(Ngo ngo);
	public Ngo fetch(int ngo_id);
	public Ngo updateNgo(int ngo_id, Ngo ngo);
	public List<Ngo> ngo_list();
	public Ngo deletengo(int ngo_id);
	
}
