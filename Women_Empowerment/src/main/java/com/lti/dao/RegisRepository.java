package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.entity.Registration;

public interface RegisRepository extends JpaRepository<Registration,Integer>{

}
