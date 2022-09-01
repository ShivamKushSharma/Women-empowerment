package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Training_course")
public class Training_course {
	@Id
	@SequenceGenerator(name="t_id_seq1", initialValue=1, allocationSize=1)
	@GeneratedValue(generator="t_id_seq1", strategy=GenerationType.SEQUENCE)
	private int t_id;
	private String course_name;
	private int duration;
	private String start_date;
	private String ngo_name;
	private String location;
//	@ManyToOne
//	@JoinColumn(name="ngo_id")
//	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//	private Ngo ngo_id;
//	
//	@OneToOne
//	@JoinColumn(name="User_registeration")
//	private Registration r_id;
//	
	
//	@OneToOne(mappedBy = "training_course", cascade=CascadeType.ALL)
//	private Registration r_id;
//	
	

//	public Registration getR_id() {
//		return r_id;
//	}
//
//	public void setR_id(Registration r_id) {
//		this.r_id = r_id;
//	}


	public Training_course() {
	
	}



	
	
//	@ManyToMany(mappedBy="course_list")
//	private List<User_course> usercourse_list=new ArrayList<User_course>();
//
//	public List<User_course> getUsercourse_list() {
//		return usercourse_list;
//	}
//
//	public void setUsercourse_list(List<User_course> usercourse_list) {
//		this.usercourse_list = usercourse_list;
//	}






	public int getT_id() {
		return t_id;
	}

	public String getLocation() {
		return location;
	}





	public void setLocation(String location) {
		this.location = location;
	}





	public Training_course(int t_id, String course_name, int duration, String start_date, String ngo_name,
			String location) {
		super();
		this.t_id = t_id;
		this.course_name = course_name;
		this.duration = duration;
		this.start_date = start_date;
		this.ngo_name = ngo_name;
		this.location = location;
	}





	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}





	public String getNgo_name() {
		return ngo_name;
	}





	public void setNgo_name(String ngo_name) {
		this.ngo_name = ngo_name;
	}





	@Override
	public String toString() {
		return "Training_course [t_id=" + t_id + ", course_name=" + course_name + ", duration=" + duration
				+ ", start_date=" + start_date + ", ngo_name=" + ngo_name + ", location=" + location + "]";
	}





	

	

//	public Ngo getNgo_id() {
//		return ngo_id;
//	}
//
//	public void setNgo_id(Ngo ngo_id) {
//		this.ngo_id = ngo_id;
//	}

	
	

	

	

	
	
}
