package com.tcs.model;

import java.sql.Date;

public class Professor {

	private Integer pId;
	private String fname;
	private String lname;
	private Integer mobileno;
	private Date Dob;
	private String email;
	
	public Integer getMobileno() {
		return mobileno;
	}
	public void setMobileno(Integer mobileno) {
		this.mobileno = mobileno;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Professor [pId=" + pId + ", fname=" + fname + ", lname=" + lname + ", mobileno=" + mobileno + ", Dob="
				+ Dob + ", email=" + email + "]";
	}
	

}
