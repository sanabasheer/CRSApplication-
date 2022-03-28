/**
 * 
 */
package com.tcs.model;

/**
 * @author springuser19
 *
 */
public class ReportCard {
	private Integer studentId;
	private String studentName;
	private Integer courseId;
	private String courseName;
	private Integer marks;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentReportCard [studentId=" + studentId + ", studentName=" + studentName + ", courseId=" + courseId
				+ ", courseName=" + courseName + ", marks=" + marks + "]";
	}
	
	
	
}
