package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="User_D")
public class User {
	
	@Id
	@SequenceGenerator(name="u_id_seq1", initialValue=1, allocationSize=1)
	@GeneratedValue(generator="u_id_seq1", strategy=GenerationType.SEQUENCE)
	private int u_id;
	private String username;
	private String name;
	private String password;
	private String mobileNo;
	private String dob;
//	
//	@OneToOne(mappedBy = "u_id", cascade=CascadeType.ALL)
//	private Registration registration;
//	
//	
		
	
//	public Registration getRegistration() {
//		return registration;
//	}
//	public void setRegistration(Registration registration) {
//		this.registration = registration;
//	}
	public User() {
	
	}
	
	
	public User(int u_id, String username, String name, String password, String mobileNo, String dob
		) {
		super();
		this.u_id = u_id;
		this.username = username;
		this.name = name;
		this.password = password;
		this.mobileNo = mobileNo;
		this.dob = dob;
	
	}
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", username=" + username + ", name=" + name + ", password=" + password
				+ ", mobileNo=" + mobileNo + ", dob=" + dob + "]";
	}
	
	
	
	
	
	

}
