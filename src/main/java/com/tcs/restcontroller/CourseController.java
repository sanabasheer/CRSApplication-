/**
 * 
 */
package com.tcs.restcontroller;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dao.CourseDAO;
import com.tcs.model.Course;
import com.tcs.model.Professor;
import com.tcs.model.ReportCard;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author springuser19
 *
 */
@RestController
public class CourseController {
	@Autowired //The meaning of @Autowired is put the dependency injection at the Dao layer
	private CourseDAO courseDAO;

	//get list of courses.
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/course")
		@ResponseBody
		public List getCourse() {
			return courseDAO.listCourses();
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/post/courses")
	@ResponseBody
	public ResponseEntity addCourse(@RequestBody Course course) {

		course=courseDAO.create(course);
		return new ResponseEntity(course, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value = "/course/{courseid}")
		@ResponseBody
	public ResponseEntity getCourse(@PathVariable("courseid") Integer courseid) {

		Course course = courseDAO.getCourse(courseid);
		if (course == null) {
			return new ResponseEntity("No course found for ID " + courseid, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(course, HttpStatus.OK);
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/delete/course/{courseid}")
	@ResponseBody
	public ResponseEntity deleteCourse(@PathVariable("courseid") Integer courseid) {

		if (null == courseDAO.delete(courseid)) {
			return new ResponseEntity("No student found for CourseID " + courseid, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity("Deleted Successfully" + " : " + courseid, HttpStatus.OK);

	}
	
	
	
	

}
