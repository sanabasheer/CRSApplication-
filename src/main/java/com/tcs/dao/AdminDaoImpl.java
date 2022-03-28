/**
 * 
 */
package com.tcs.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;

import com.tcs.mapper.ProfessorMapper;
import com.tcs.mapper.StudentMapper;
import com.tcs.model.Professor;
import com.tcs.model.ReportCard;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author springuser19
 *
 */
@Repository
public class AdminDaoImpl implements AdminDao{
	
	// create the reference of logger here

	Logger logger = LoggerFactory.getLogger(AdminDaoImpl.class);

	// DI injection of JDBCTemplate

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	@Override
	@Transactional

	public Professor getProfessor(Integer pid) {
		// TODO Auto-generated method stub 
		String SQL = "select * from professor where pid = ?";
		 Professor professor = jdbcTemplateObject.queryForObject(SQL, new Object[] { pid }, new  ProfessorMapper());
		logger.debug("value", jdbcTemplateObject.queryForObject(SQL, new Object[] { pid }, new  ProfessorMapper()));
		logger.debug("value of emp-->" + professor.toString());
		return professor;
		
	}

	@Override
	@Transactional
	public List<Professor> listProfessor() {
		// TODO Auto-generated method stub
				String SQL = "select * from professor";
				List<Professor> professors = jdbcTemplateObject.query(SQL, new ProfessorMapper());
				logger.debug("in debug");
				return professors;
		
	}

	
	@Override
	@Transactional
	public Professor create(Professor professor) {
		// TODO Auto-generated method stub
			String professorDetails = "INSERT INTO PROFESSOR (pId,fname,lname,mobileno,Dob,email) values (?,?,?,?,?,?)";
			jdbcTemplateObject.update(professorDetails,professor.getpId(),professor.getFname(),professor.getLname(),professor.getMobileno(),
			professor.getDob(),professor.getEmail());
			return professor;
			
		
	}

	@Override
	@Transactional
	public ReportCard generateCard(Integer studentId) {
		String reportCardDetails="select * from studentreportcard where studentId = ?";
		ReportCard reportcard = jdbcTemplateObject.queryForObject(reportCardDetails, new Object[] {studentId }, new  StudentMapper());
		logger.debug("value", jdbcTemplateObject.queryForObject(reportCardDetails, new Object[] {studentId }, new  StudentMapper()));
		logger.debug("value of reportcard-->" + reportcard.toString());
		return reportcard;
		
		
		
	}

	
	
	

}
