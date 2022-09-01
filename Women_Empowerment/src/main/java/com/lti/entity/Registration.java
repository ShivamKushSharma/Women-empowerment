package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="User_registeration")
public class Registration {

	@Id
	@SequenceGenerator(name="r_id_seq1", initialValue=1, allocationSize=1)
	@GeneratedValue(generator="r_id_seq1", strategy=GenerationType.SEQUENCE)
	private int r_id;
	private String name;
	private String designation;
	private double salary;
	private int no_of_member;
	private int no_of_children;
	private double family_income;
	private String criteria;
	private String aadhar_no;
	private String pan_no;
	private String email;
	private String address;
	private String course;
	
//	@OneToOne(mappedBy = "r_id", cascade=CascadeType.ALL)
//	private Training_course training_course;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@OneToOne
	@JoinColumn(name="Training_Course")
	private Training_course training_course;
	
	
	
	@OneToOne
	@JoinColumn(name="User_D")
	private User u_id;
	
	

	
	public Training_course getTraining_course() {
		return training_course;
	}
	public void setTraining_course(Training_course training_course) {
		this.training_course = training_course;
	}
	public Registration() {
	
	}
	
	public Registration(int r_id, String name, String designation, double salary, int no_of_member, int no_of_children,
			double family_income, String criteria, String aadhar_no, String pan_no, String email, String address,
			String course, Training_course training_course, User u_id) {
		super();
		this.r_id = r_id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.no_of_member = no_of_member;
		this.no_of_children = no_of_children;
		this.family_income = family_income;
		this.criteria = criteria;
		this.aadhar_no = aadhar_no;
		this.pan_no = pan_no;
		this.email = email;
		this.address = address;
		this.course = course;
		this.training_course = training_course;
		this.u_id = u_id;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getNo_of_member() {
		return no_of_member;
	}
	public void setNo_of_member(int no_of_member) {
		this.no_of_member = no_of_member;
	}
	public int getNo_of_children() {
		return no_of_children;
	}
	public void setNo_of_children(int no_of_children) {
		this.no_of_children = no_of_children;
	}
	public double getFamily_income() {
		return family_income;
	}
	public void setFamily_income(double family_income) {
		this.family_income = family_income;
	}
	public String getCriteria() {
		return criteria;
	}
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}
	public String getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User getU_id() {
		return u_id;
	}
	public void setU_id(User u_id) {
		this.u_id = u_id;
	}
	@Override
	public String toString() {
		return "Registration [r_id=" + r_id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", no_of_member=" + no_of_member + ", no_of_children=" + no_of_children + ", family_income="
				+ family_income + ", criteria=" + criteria + ", aadhar_no=" + aadhar_no + ", pan_no=" + pan_no
				+ ", email=" + email + ", address=" + address + ", course=" + course + ", training_course="
				+ training_course + ", u_id=" + u_id + "]";
	}
	
	
	
	
	
}
