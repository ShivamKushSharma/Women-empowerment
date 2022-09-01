package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Ngo_Details")
public class Ngo {

	@Id
	@SequenceGenerator(name="ngo_id_seq1", initialValue=1, allocationSize=1)
	@GeneratedValue(generator="ngo_id_seq1", strategy=GenerationType.SEQUENCE)
	private int ngo_id;
	private String ngo_name;
	private String ngo_address;
	private double ngo_phone;
	private String orgType;
	private String incharge;
	
	@JoinColumn(name="ngo_id")
	@OneToMany(targetEntity = Training_course.class, cascade=CascadeType.ALL)
	private List<Training_course> tlist=new ArrayList<Training_course>();
	
	
	
	public List<Training_course> getTlist() {
		return tlist;
	}
	public void setTlist(List<Training_course> tlist) {
		this.tlist = tlist;
	}
	
	public Ngo() {}
	
	
	
	
	public Ngo(int ngo_id, String ngo_name, String ngo_address, double ngo_phone, String orgType, String incharge,
			List<Training_course> tlist) {
		super();
		this.ngo_id = ngo_id;
		this.ngo_name = ngo_name;
		this.ngo_address = ngo_address;
		this.ngo_phone = ngo_phone;
		this.orgType = orgType;
		this.incharge = incharge;
		this.tlist = tlist;
	}
	
	
	
	public int getNgo_id() {
		return ngo_id;
	}
	public void setNgo_id(int ngo_id) {
		this.ngo_id = ngo_id;
	}
	public String getNgo_name() {
		return ngo_name;
	}
	public void setNgo_name(String ngo_name) {
		this.ngo_name = ngo_name;
	}
	public String getNgo_address() {
		return ngo_address;
	}
	public void setNgo_address(String ngo_address) {
		this.ngo_address = ngo_address;
	}
	public double getNgo_phone() {
		return ngo_phone;
	}
	public void setNgo_phone(double ngo_phone) {
		this.ngo_phone = ngo_phone;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public String getIncharge() {
		return incharge;
	}
	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}
	@Override
	public String toString() {
		return "Ngo [ngo_id=" + ngo_id + ", ngo_name=" + ngo_name + ", ngo_address=" + ngo_address + ", ngo_phone="
				+ ngo_phone + ", orgType=" + orgType + ", incharge=" + incharge + ", tlist=" + tlist + "]";
	}
	
	
	

	
	
}
