/**
 * 
 */
package com.tcs.model;

/**
 * @author springuser19
 *
 */
public class Course {
	
	private Integer studentid;
	private Integer courseid;
	private String  coursename;
	private String  professor;
	
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public Integer getCourseid() {
		return courseid;
	}
	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	@Override
	public String toString() {
		return "Course [studentid=" + studentid + ", courseid=" + courseid + ", coursename=" + coursename
				+ ", professor=" + professor + "]";
	}
	
	

}
