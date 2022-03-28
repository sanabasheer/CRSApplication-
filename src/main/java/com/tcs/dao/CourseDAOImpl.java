/**
 * 
 */
package com.tcs.dao;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.mapper.CourseMapper;
import com.tcs.model.Course;


	@Repository
	public class CourseDAOImpl implements CourseDAO{
		Logger logger = LoggerFactory.getLogger(CourseDAOImpl.class);

		// DI injection of JDBCTemplate

		@Autowired
		private JdbcTemplate jdbcTemplateObject;

		@Override
		@Transactional
		public Course create(Course course) {
			// TODO Auto-generated method stub
			String SQL = "insert into course (studentid, courseid,coursename,  professor) values (?, ?,?,?)";
			jdbcTemplateObject.update(SQL, course.getStudentid(),course.getCourseid(),course.getCoursename(),course.getProfessor());
			return course;
		}

		@Override
		public Course getCourse(Integer courseid) {
			String courseDetailsGetById = "select * from course where courseid = ?";
			Course course = jdbcTemplateObject.queryForObject(courseDetailsGetById, new Object[] { courseid }, new CourseMapper());
			logger.debug("value", jdbcTemplateObject.queryForObject(courseDetailsGetById, new Object[] { courseid }, new CourseMapper()));
			;
			logger.debug("value of cou-->" + course.toString());
			return course;
			
		}

		@Override
		@Transactional
		public List<Course> listCourses() {
			// TODO Auto-generated method stub
			String courseList = "select * from course";
			List<Course> Courses = jdbcTemplateObject.query(courseList, new CourseMapper());
			logger.debug("in debug");
			return Courses;
		}

		@Override
		public  Course delete(Integer courseid) {
			String deleteCourse = "delete from course where courseid = ?";
			jdbcTemplateObject.update(deleteCourse, courseid);
			
			return  null;
			
		}

		
		
	}

