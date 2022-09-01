package com.lti.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="User_course")
public class User_course {

	@Id
	@SequenceGenerator(name="c_id_seq1", initialValue=1, allocationSize=1)
	@GeneratedValue(generator="c_id_seq1", strategy=GenerationType.SEQUENCE)
	private int c_id;
	private String name;
	private String courseName;
//	@ManyToOne
//	@JoinColumn(name="User_D")
//	private User u_id;
	
//	@ManyToMany
//	@JoinColumn(name="Training_course")
//	private List<Training_course> course_list=new ArrayList<Training_course>();
	
//	@ManyToMany(cascade = {CascadeType.ALL})
//    @JoinTable(name="Training_Course", 
//                joinColumns={@JoinColumn(name="c_id")}, 
//                inverseJoinColumns={@JoinColumn(name="t_id")})
//    private List<Training_course> course_list= new ArrayList<Training_course>();
	
//	public User_course() {
//	
//	}
	
	

	



	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
//	public User getU_id() {
//		return u_id;
//	}
//	public void setU_id(User u_id) {
//		this.u_id = u_id;
//	}
//	public Training_course getT_id() {
//		return t_id;
//	}
//	public void setT_id(Training_course t_id) {
//		this.t_id = t_id;
//	}
	
	


//
//
//	public List<Training_course> getCourse_list() {
//		return course_list;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "User_course [c_id=" + c_id + ", name=" + name + ", courseName=" + courseName + ", u_id=" + u_id
//				+ ", course_list=" + course_list + "]";
//	}
//
//
//
//	public void setCourse_list(List<Training_course> course_list) {
//		this.course_list = course_list;
//	}
//	
//	
//	
//	
//	
	
	
}
