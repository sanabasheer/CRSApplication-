/**
 * 
 */
package com.tcs.dao;

import java.util.List;

import com.tcs.model.Course;
import com.tcs.model.ReportCard;

/**
 * @author springuser19
 *
 */
public interface CourseDAO {
	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */
	Course course=new Course();

	public Course create(Course course);

	public Course getCourse(Integer courseid);

	public List<Course> listCourses();

	public Course delete(Integer courseid);

	

	

}
