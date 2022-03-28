/**
 * 
 */
package com.tcs.mapper;
import java.sql.ResultSet;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.Course;

/**
 * @author springuser19
 *
 */
public class CourseMapper implements RowMapper<Course> { 
	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Course course = new Course();
		course.setStudentid(rs.getInt("studentid"));
		course.setCourseid(rs.getInt("courseid"));
		course.setCoursename(rs.getString("coursename"));
		course.setProfessor(rs.getString("professor"));
		return course;

	}

}
